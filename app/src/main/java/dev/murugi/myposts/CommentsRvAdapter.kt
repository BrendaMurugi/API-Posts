package dev.murugi.myposts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.murugi.myposts.databinding.CommentsListItemBinding

class CommentsRvAdapter(var commentList:List<Comment>):RecyclerView.Adapter<CommentViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentViewHolder {
         var binding = CommentsListItemBinding
             .inflate(LayoutInflater.from(parent.context), parent,false)
        return CommentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CommentViewHolder, position: Int) {
         var currentComment = commentList.get(position)
        with(holder.binding){
            tvText.text = currentComment.postId.toString()
            tvText2.text = currentComment.id.toString()
            tvText3.text = currentComment.name.toString()
            tvText4.text = currentComment.email.toString()
            tvText5.text = currentComment.body.toString()
        }
    }

    override fun getItemCount(): Int {
         return commentList.size
    }
}

class CommentViewHolder(var binding: CommentsListItemBinding):RecyclerView.ViewHolder(binding.root)