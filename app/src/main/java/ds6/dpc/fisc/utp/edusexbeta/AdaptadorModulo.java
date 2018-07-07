package ds6.dpc.fisc.utp.edusexbeta;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorModulo  extends RecyclerView.Adapter<AdaptadorModulo.ViewHolderModulo>{

    ArrayList<ModuloVo> listaModulos;

    public AdaptadorModulo(ArrayList<ModuloVo> listaModulos) {
        this.listaModulos = listaModulos;
    }
    @Override
    public ViewHolderModulo onCreateViewHolder(ViewGroup parent, int viewType) {
        View view =  LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_modulos,null,false);
        return new ViewHolderModulo(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderModulo holder, int position) {

     holder.etiNombre.setText(listaModulos.get(position).getNombre());
        holder.etiInformacion.setText(listaModulos.get(position).getFoto());
        holder.foto.setImageResource(listaModulos.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return listaModulos.size();
    }


    public class ViewHolderModulo extends RecyclerView.ViewHolder {

        TextView etiNombre,etiInformacion;
        ImageView foto;

        public ViewHolderModulo(View itemView) {
            super(itemView);

            etiNombre= (TextView) itemView.findViewById(R.id.idNombre);
            etiInformacion= (TextView) itemView.findViewById(R.id.idInfo);
            foto= (ImageView) itemView.findViewById(R.id.idImagen);


        }
    }
}
