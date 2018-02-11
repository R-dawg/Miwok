package com.example.android.miwok;

/**
 * Created by randall on 9/17/17.
 */

public class Word {
    // Word in default language (English)
    private String mDefaultTranslation;

    // Word in Miwok language
    private String mMiwokTranslation;

    // Image resource associated with the word
    private int mImageResourceId = NO_IMAGE;

    // Default of no image
    private static final int NO_IMAGE = -1;

    // Audio resource associated with the word
    private int mAudioResourceId;

    /**
     *
     * @param defaultTranslation is the word in the user's language of choice
     * @param miwokTranslation is the word in the miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     *
     * @param defaultTranslation is the word in the user's language of choice
     * @param miwokTranslation is the word in the miwok language
     * @param imageResourceId is the drawable resource id associated with the word
     */
//    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
//        mDefaultTranslation = defaultTranslation;
//        mMiwokTranslation = miwokTranslation;
//        mImageResourceId = imageResourceId;
//    }

    /**
     *
     * @param defaultTranslation is the word in the user's language of choice
     * @param miwokTranslation is the word in the miwok language
     * @param imageResourceId is the drawable resource id associated with the word
     * @param audioResourceId is the audio file associated with the miwok word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() { return mImageResourceId != NO_IMAGE; }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
