package com.myfirst.identitycard;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class IdentityCardViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvTitle;
    private ImageView mIvImage;
    private TextView mTvAge;
    private TextView mTvProfession;

    public IdentityCardViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews();
    }

    private void initViews() {
        mTvTitle = itemView.findViewById(R.id.tvTitle);
        mIvImage = itemView.findViewById(R.id.ivImage);
        mTvAge = itemView.findViewById(R.id.tvAgeInput);
        mTvProfession = itemView.findViewById(R.id.tvProfessionInput);
    }

    public void setData(IdentityCardModel identityCardModel){
        mTvTitle.setText(identityCardModel.getTitle());
        mIvImage.setImageResource(identityCardModel.getImageId());
        mTvAge.setText(identityCardModel.getAge()+"");
        mTvProfession.setText(identityCardModel.getProfession());
    }
}
