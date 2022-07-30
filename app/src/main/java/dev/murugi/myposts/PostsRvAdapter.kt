package dev.murugi.myposts

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.murugi.myposts.databinding.PostListItemBinding

class PostsRvAdapter(var context: Context, var postList:List<Post>): RecyclerView.Adapter<PostsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsViewHolder {
        var binding = PostListItemBinding
            .inflate(LayoutInflater.from(context),parent,false)
        return PostsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PostsViewHolder, position: Int) {
        var currentPost = postList.get(position)
        with(holder.binding){
            tvUserId.text = currentPost.userId.toString()
            tvId.text = currentPost.id.toString()
            tvTitle.text = currentPost.title
            tvBody.text = currentPost.body
        }
    }

    override fun getItemCount(): Int {
        return postList.size
    }
}

class PostsViewHolder(var binding : PostListItemBinding): RecyclerView.ViewHolder(binding.root){}