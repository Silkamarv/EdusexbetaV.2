package ds6.dpc.fisc.utp.edusexbeta;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorGlosario extends RecyclerView.Adapter<AdaptadorGlosario.ViewHolderGlosario> {
    ArrayList<GlosarioVo> ListaGlosario;

    public AdaptadorGlosario(ArrayList<GlosarioVo> listaGlosario) {
        this.ListaGlosario = listaGlosario;
    }

    @Override
    public ViewHolderGlosario onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_glosario,null,false);
        return new ViewHolderGlosario(view);
    }

    @Override
    public void onBindViewHolder( ViewHolderGlosario holder, int position) {
        holder.etiNombre.setText(ListaGlosario.get(position).getNombre());
        holder.etiInformacion.setText(ListaGlosario.get(position).getInfo());

    }

    @Override
    public int getItemCount() {
        return ListaGlosario.size();
    }

    public class ViewHolderGlosario extends RecyclerView.ViewHolder {

        TextView etiNombre, etiInformacion;

        public ViewHolderGlosario(View itemView) {
            super(itemView);
            etiNombre=(TextView) itemView.findViewById(R.id.idNombre);
            etiInformacion=(TextView) itemView.findViewById(R.id.idInfo);
        }
    }

}
