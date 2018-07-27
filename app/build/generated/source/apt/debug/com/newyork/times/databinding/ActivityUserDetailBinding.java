package com.newyork.times.databinding;
import com.newyork.times.R;
import com.newyork.times.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityUserDetailBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 8);
        sViewsWithIds.put(R.id.people_card, 9);
        sViewsWithIds.put(R.id.image_user, 10);
        sViewsWithIds.put(R.id.image_phone, 11);
        sViewsWithIds.put(R.id.image_mail, 12);
        sViewsWithIds.put(R.id.image_home, 13);
        sViewsWithIds.put(R.id.image_gender, 14);
    }
    // views
    @NonNull
    public final android.widget.ImageView imageGender;
    @NonNull
    public final android.widget.ImageView imageHome;
    @NonNull
    public final android.widget.ImageView imageMail;
    @NonNull
    public final android.widget.ImageView imagePhone;
    @NonNull
    public final android.widget.ImageView imageUser;
    @NonNull
    private final android.support.design.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final android.support.design.widget.CollapsingToolbarLayout mboundView1;
    @NonNull
    private final de.hdodenhof.circleimageview.CircleImageView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    public final android.support.v7.widget.CardView peopleCard;
    @NonNull
    public final android.support.v7.widget.Toolbar toolbar;
    // variables
    @Nullable
    private com.newyork.times.viewModel.UserDetailViewModel mUserDetailViewModel;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityUserDetailBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds);
        this.imageGender = (android.widget.ImageView) bindings[14];
        this.imageHome = (android.widget.ImageView) bindings[13];
        this.imageMail = (android.widget.ImageView) bindings[12];
        this.imagePhone = (android.widget.ImageView) bindings[11];
        this.imageUser = (android.widget.ImageView) bindings[10];
        this.mboundView0 = (android.support.design.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.support.design.widget.CollapsingToolbarLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (de.hdodenhof.circleimageview.CircleImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.peopleCard = (android.support.v7.widget.CardView) bindings[9];
        this.toolbar = (android.support.v7.widget.Toolbar) bindings[8];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.userDetailViewModel == variableId) {
            setUserDetailViewModel((com.newyork.times.viewModel.UserDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUserDetailViewModel(@Nullable com.newyork.times.viewModel.UserDetailViewModel UserDetailViewModel) {
        this.mUserDetailViewModel = UserDetailViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.userDetailViewModel);
        super.requestRebind();
    }
    @Nullable
    public com.newyork.times.viewModel.UserDetailViewModel getUserDetailViewModel() {
        return mUserDetailViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String userDetailViewModelEmail = null;
        java.lang.String userDetailViewModelCell = null;
        java.lang.String userDetailViewModelProfileThumb = null;
        com.newyork.times.viewModel.UserDetailViewModel userDetailViewModel = mUserDetailViewModel;
        java.lang.String userDetailViewModelAddress = null;
        java.lang.String userDetailViewModelFullUserName = null;
        java.lang.String userDetailViewModelGender = null;
        int userDetailViewModelEmailVisibility = 0;
        java.lang.String userDetailViewModelUserName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (userDetailViewModel != null) {
                    // read userDetailViewModel.email
                    userDetailViewModelEmail = userDetailViewModel.getEmail();
                    // read userDetailViewModel.cell
                    userDetailViewModelCell = userDetailViewModel.getCell();
                    // read userDetailViewModel.profileThumb
                    userDetailViewModelProfileThumb = userDetailViewModel.getProfileThumb();
                    // read userDetailViewModel.address
                    userDetailViewModelAddress = userDetailViewModel.getAddress();
                    // read userDetailViewModel.fullUserName
                    userDetailViewModelFullUserName = userDetailViewModel.getFullUserName();
                    // read userDetailViewModel.gender
                    userDetailViewModelGender = userDetailViewModel.getGender();
                    // read userDetailViewModel.emailVisibility
                    userDetailViewModelEmailVisibility = userDetailViewModel.getEmailVisibility();
                    // read userDetailViewModel.userName
                    userDetailViewModelUserName = userDetailViewModel.getUserName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.mboundView1.setTitle(userDetailViewModelFullUserName);
            com.newyork.times.viewModel.UserDetailViewModel.loadImage(this.mboundView2, userDetailViewModelProfileThumb);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, userDetailViewModelUserName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, userDetailViewModelCell);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, userDetailViewModelEmail);
            this.mboundView5.setVisibility(userDetailViewModelEmailVisibility);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, userDetailViewModelGender);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, userDetailViewModelAddress);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityUserDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityUserDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityUserDetailBinding>inflate(inflater, com.newyork.times.R.layout.activity_user_detail, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityUserDetailBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityUserDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.newyork.times.R.layout.activity_user_detail, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityUserDetailBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityUserDetailBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_user_detail_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityUserDetailBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): userDetailViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}