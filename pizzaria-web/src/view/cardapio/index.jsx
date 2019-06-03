import React, { Component, Fragment } from "react";
import {
  FormGroup,
  withStyles,
  FormControlLabel,
  Checkbox,
  Grid,
  Radio,
  RadioGroup,
  Button,
  Paper,
  CssBaseline
} from "@material-ui/core";
import { Pedido } from "..";

const styles = theme => ({
  paper: {
    marginTop: theme.spacing(8),
    padding: theme.spacing(5)
  },
  root: {
    padding: theme.spacing.unit * 3,
    display: "flex"
  },
  form: {
    width: "100%", // Fix IE 11 issue.
    marginTop: theme.spacing.unit
  },
  submit: {
    margin: theme.spacing.unit * 3
}
});

const API = "http://localhost:8080/pedido/";

class Cardapio extends Component {
  state = {
    tamanho: "",
    sabor: "",
    ingredientesAdicionais: [],
    pedido: []
  };

  handleChangeTamanho = event => {
    this.setState({ tamanho: event.target.value });
  };

  handleChangeSabor = event => {
    this.setState({ sabor: event.target.value });
  };

  handleChangeAdicionais = name_checked => event => {
    const checked = event.target.checked;
    const copyAdicionais = this.state.ingredientesAdicionais.slice();
    if (checked) {
      copyAdicionais.push({ nome: name_checked });
      this.setState({ ingredientesAdicionais: copyAdicionais });
    } else {
      const filterAdicionais = copyAdicionais.filter(
        name => name.nome !== name_checked
      );
      this.setState({ ingredientesAdicionais: filterAdicionais });
    }
  };

  handleSubmit = event => {
    event.preventDefault();

    fetch(API, {
      method: "POST",
      headers: {
        Accept: "application/json",
        "Content-Type": "application/json"
      },
      body: JSON.stringify(this.state)
    })
      .then(resp => resp.json())
      .then(values => {
        this.setState({ pedido: values });
      })
      .catch(error => {
        this.setState({ ingredientesAdicionais: [] });
      });
  };

  render() {
    const { classes } = this.props;
    return (
      <Fragment>
        <form className={classes.form} onSubmit={this.handleSubmit}>
          <CssBaseline />
          <Paper className={classes.paper}>
            <Grid container spacing={3}>
              <Grid item xs={12} sm={6} md={4}>
                <RadioGroup
                  aria-label="Gender"
                  name="gender1"
                  value={this.state.sabor}
                  onChange={this.handleChangeSabor}
                >
                  <FormControlLabel
                    value="portuguesa"
                    control={<Radio />}
                    label="Portuguesa"
                  />
                  <FormControlLabel
                    value="Marguerita"
                    control={<Radio />}
                    label="Marguerita"
                  />
                  <FormControlLabel
                    value="Calabresa"
                    control={<Radio />}
                    label="calabresa"
                  />
                </RadioGroup>
              </Grid>
              <Grid item xs={12} sm={6} md={4}>
                <RadioGroup
                  aria-label="tamanho"
                  name="tamanho"
                  //className={classes.group}
                  value={this.state.tamanho}
                  onChange={this.handleChangeTamanho}
                >
                  <FormControlLabel
                    value="grande"
                    control={<Radio />}
                    label="Grande"
                  />
                  <FormControlLabel
                    value="Media"
                    control={<Radio />}
                    label="Média"
                  />
                  <FormControlLabel
                    value="Pequena"
                    control={<Radio />}
                    label="Pequena"
                  />
                </RadioGroup>
              </Grid>

              <Grid item xs={12} sm={6} md={4}>
                <FormGroup row>
                  <FormControlLabel
                    control={
                      <Checkbox
                        value="Extra bacon"
                        onChange={this.handleChangeAdicionais("Extra bacon")}
                      />
                    }
                    label="Extra bacon"
                  />
                  <FormControlLabel
                    control={
                      <Checkbox
                        value="Sem cebola"
                        onChange={this.handleChangeAdicionais("Sem cebola")}
                      />
                    }
                    label="Sem cebola"
                  />
                  <FormControlLabel
                    control={
                      <Checkbox
                        value="Borda recheada"
                        onChange={this.handleChangeAdicionais("Borda recheada")}
                      />
                    }
                    label="Borda recheada"
                  />
                </FormGroup>
              </Grid>
            </Grid>
          </Paper>
          <Button
            type="submit"
            variant="contained"
            color="secondary"
            className={classes.submit}
          >
            Fazer pedido
          </Button>
        </form>
        <Pedido pedido={this.state.pedido} />
      </Fragment>
    );
  }
}

export default withStyles(styles)(Cardapio);
