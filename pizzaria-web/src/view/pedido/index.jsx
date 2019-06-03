import React, { Component } from "react";
import {
  withStyles,
  Paper,
  Divider,
  Typography,
  CssBaseline,
  Grid
} from "@material-ui/core";

const styles = theme => ({
  root: {
    padding: theme.spacing.unit * 3
  },
  paper: {
    marginTop: theme.spacing(8),
    padding: theme.spacing(5)
  }
});

class Pedido extends Component {
  render() {
    const classes = this.props;

    return (
      <div>
        <Paper className={classes.paper}>
          <CssBaseline />

          <Typography variant="h5" component="h3">
            PEDIDO
          </Typography>
          <Divider />
          <Grid container spacing={3}>
            <Grid item>
              <Typography variant="body1" component="small">
                SABOR:
              </Typography>
              {this.props.pedido.sabor}
            </Grid>
            <Grid item>
              <Typography variant="body1" component="small">
                TAMANHO:
              </Typography>
              {this.props.pedido.tamanho}
            </Grid>
            <Grid item>
              <Typography variant="body1" component="small">
                TEMPO DE PREPARO:
              </Typography>
              {this.props.pedido.tempoPreparo} Min
            </Grid>
            <Grid item>
              <Typography variant="body1" component="small">
                VALOR A RECEBER:
              </Typography>
              {this.props.pedido.total} R$
            </Grid>
            <Grid item>
              <Typography variant="body1" component="small">
                ADICIONAIS:
              </Typography>
              {/* {adicionais &&(
                this.props.pedido.ingredientesAdicionais.map(itens => (
                  <div>itens.nome</div>
               ) ))} */}
            </Grid>
          </Grid>
        </Paper>
      </div>
    );
  }
}

export default withStyles(styles)(Pedido);
