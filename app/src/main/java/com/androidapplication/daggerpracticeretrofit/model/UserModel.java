
package com.androidapplication.daggerpracticeretrofit.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class UserModel {

    @SerializedName("data")
    private List<UserProfile> mData;
    @SerializedName("page")
    private Long mPage;
    @SerializedName("per_page")
    private Long mPerPage;
    @SerializedName("total")
    private Long mTotal;
    @SerializedName("total_pages")
    private Long mTotalPages;

    public UserModel() {
    }

    public UserModel(List<UserProfile> mData, Long mPage, Long mPerPage, Long mTotal, Long mTotalPages) {
        this.mData = mData;
        this.mPage = mPage;
        this.mPerPage = mPerPage;
        this.mTotal = mTotal;
        this.mTotalPages = mTotalPages;
    }

    public List<UserProfile> getData() {
        return mData;
    }

    public void setData(List<UserProfile> data) {
        mData = data;
    }

    public Long getPage() {
        return mPage;
    }

    public void setPage(Long page) {
        mPage = page;
    }

    public Long getPerPage() {
        return mPerPage;
    }

    public void setPerPage(Long perPage) {
        mPerPage = perPage;
    }

    public Long getTotal() {
        return mTotal;
    }

    public void setTotal(Long total) {
        mTotal = total;
    }

    public Long getTotalPages() {
        return mTotalPages;
    }

    public void setTotalPages(Long totalPages) {
        mTotalPages = totalPages;
    }

}
