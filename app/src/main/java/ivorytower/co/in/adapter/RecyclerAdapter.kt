package ivorytower.co.`in`.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ivorytower.co.`in`.R
import kotlinx.android.synthetic.main.recycler_item.view.*
import ivorytower.co.`in`.model.UserModel

class RecyclerAdapter(var data : ArrayList<UserModel>?, var listener: ItemClickListener) : RecyclerView.Adapter<RecyclerAdapter.Holder>() {

    interface ItemClickListener {
        fun onItemClicked(repos: UserModel?)
    }


    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindItems(data?.get(position))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        return Holder(v)
    }

    override fun getItemCount(): Int = data?.size?:0


    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView){
        @SuppressLint("SetTextI18n")
        fun bindItems(user: UserModel?){

            itemView.setOnClickListener {
                listener.onItemClicked(user!!)
            }

            itemView.name.text = ""+user!!.userId
            itemView.email.text = user.title
        }
    }

}