
package com.androidapplication.daggerpracticeretrofit.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class UserProfile {

    @SerializedName("avatar")
    private String mAvatar;
    @SerializedName("email")
    private String mEmail;
    @SerializedName("first_name")
    private String mFirstName;
    @SerializedName("id")
    private Long mId;
    @SerializedName("last_name")
    private String mLastName;

    public UserProfile() {
    }

    public UserProfile(String mAvatar, String mEmail, String mFirstName, Long mId, String mLastName) {
        this.mAvatar = mAvatar;
        this.mEmail = mEmail;
        this.mFirstName = mFirstName;
        this.mId = mId;
        this.mLastName = mLastName;
    }

    public String getAvatar() {
        return mAvatar;
    }

    public void setAvatar(String avatar) {
        mAvatar = avatar;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

}
