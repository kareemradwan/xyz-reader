package com.example.xyzreader.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.xyzreader.R;

public class ParagraphAdapter extends RecyclerView.Adapter<ParagraphAdapter.ViewHolder> {

    private String[] newsList;

    public ParagraphAdapter( String[] news) {
        this.newsList = news;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.card_news_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setIsRecyclable(false);
        String paragraph = newsList[position];

        holder.tvNewsContent.setText(paragraph);
    }

    @Override
    public int getItemCount() {
        return newsList.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvNewsContent;

        public ViewHolder(View itemView) {
            super(itemView);

            tvNewsContent = itemView.findViewById(R.id.tv_news_content);
        }

    }

}
