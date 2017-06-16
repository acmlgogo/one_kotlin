package com.storm.cftest.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.storm.cftest.R;
import com.storm.cftest.base.Author;
import com.storm.cftest.base.ReadDetails;

import java.util.List;


public class AuthorsView extends FrameLayout {
    private static final String TAG = "AuthorsView";
    private LinearLayout ll_authors;
    private Context mContext;

    public AuthorsView(Context context) {
        this(context, null, 0);
    }

    public AuthorsView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AuthorsView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View.inflate(context, R.layout.layout_detail_authors, this);
        ll_authors = (LinearLayout) findViewById(R.id.ll_authors);
        mContext = context;
    }

    /**
     * 设置作者列表
     *
     * @param authors 作者list
     */
    public void setAuthors(List<ReadDetails.DataBean.AuthorBean> authors) {
        if (authors.size() == 0) {
            this.setVisibility(GONE);
            return;
        }
        int count = 0;
        for (int i = 0; i < authors.size(); i++) {
            final ReadDetails.DataBean.AuthorBean author = authors.get(i);
            if (author.getUser_id().equals("0")) {
                continue;
            }
            View authorView = View.inflate(mContext, R.layout.layout_author, null);
            CircleImageView civHead = (CircleImageView) authorView.findViewById(R.id.iv_head);
            TextView tvAuthorName = (TextView) authorView.findViewById(R.id.tv_author_name);
            TextView tvAuthorSummary = (TextView) authorView.findViewById(R.id.tv_summary);
            TextView tvAuthorWbName = (TextView) authorView.findViewById(R.id.tv_wb_name);
            TextView tvFollowBtn = (TextView) authorView.findViewById(R.id.tv_follow);
            Glide.with(mContext)
                    .load(author.getWeb_url())
                    
                    .into(civHead);
            tvAuthorName.setText(author.getUser_name());
            tvAuthorSummary.setText(author.getSummary());
            tvAuthorWbName.setText(author.getWb_name());
            authorView.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
//                    AuthorActivity.start(mContext, author);
                }
            });
//            tvFollowBtn.setOnClickListener(new OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    App.showToast("关注");
//                }
//            });
            ll_authors.addView(authorView);
            count++;
        }
        if (count == 0) {
            this.setVisibility(GONE);
        }
    }
}
