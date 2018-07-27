package com.universetelecom.mvvm_users.databinding;
import com.universetelecom.mvvm_users.R;
import com.universetelecom.mvvm_users.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityUsersBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 5);
        sViewsWithIds.put(R.id.nav_view, 6);
    }
    // views
    @NonNull
    public final android.support.design.widget.FloatingActionButton fab;
    @NonNull
    public final android.widget.TextView labelStatus;
    @NonNull
    public final android.support.v7.widget.RecyclerView listUser;
    @NonNull
    private final android.support.v4.widget.DrawerLayout mboundView0;
    @NonNull
    public final android.support.design.widget.NavigationView navView;
    @NonNull
    public final android.widget.ProgressBar progressBar;
    @NonNull
    public final android.support.v7.widget.Toolbar toolbar;
    // variables
    @Nullable
    private com.universetelecom.mvvm_users.viewModel.UserViewModel mUserViewModel;
    // values
    // listeners
    private OnClickListenerImpl mUserViewModelOnClickFabToLoadAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityUsersBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 4);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.fab = (android.support.design.widget.FloatingActionButton) bindings[4];
        this.fab.setTag(null);
        this.labelStatus = (android.widget.TextView) bindings[2];
        this.labelStatus.setTag(null);
        this.listUser = (android.support.v7.widget.RecyclerView) bindings[3];
        this.listUser.setTag(null);
        this.mboundView0 = (android.support.v4.widget.DrawerLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.navView = (android.support.design.widget.NavigationView) bindings[6];
        this.progressBar = (android.widget.ProgressBar) bindings[1];
        this.progressBar.setTag(null);
        this.toolbar = (android.support.v7.widget.Toolbar) bindings[5];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.userViewModel == variableId) {
            setUserViewModel((com.universetelecom.mvvm_users.viewModel.UserViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUserViewModel(@Nullable com.universetelecom.mvvm_users.viewModel.UserViewModel UserViewModel) {
        this.mUserViewModel = UserViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.userViewModel);
        super.requestRebind();
    }
    @Nullable
    public com.universetelecom.mvvm_users.viewModel.UserViewModel getUserViewModel() {
        return mUserViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeUserViewModelProgressBar((android.databinding.ObservableInt) object, fieldId);
            case 1 :
                return onChangeUserViewModelUserLabel((android.databinding.ObservableInt) object, fieldId);
            case 2 :
                return onChangeUserViewModelUserRecycler((android.databinding.ObservableInt) object, fieldId);
            case 3 :
                return onChangeUserViewModelMessageLabel((android.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeUserViewModelProgressBar(android.databinding.ObservableInt UserViewModelProgressBar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeUserViewModelUserLabel(android.databinding.ObservableInt UserViewModelUserLabel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeUserViewModelUserRecycler(android.databinding.ObservableInt UserViewModelUserRecycler, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeUserViewModelMessageLabel(android.databinding.ObservableField<java.lang.String> UserViewModelMessageLabel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
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
        int userViewModelProgressBarGet = 0;
        android.databinding.ObservableInt userViewModelProgressBar = null;
        int userViewModelUserRecyclerGet = 0;
        int userViewModelUserLabelGet = 0;
        android.databinding.ObservableInt userViewModelUserLabel = null;
        com.universetelecom.mvvm_users.viewModel.UserViewModel userViewModel = mUserViewModel;
        android.databinding.ObservableInt userViewModelUserRecycler = null;
        android.databinding.ObservableField<java.lang.String> userViewModelMessageLabel = null;
        java.lang.String userViewModelMessageLabelGet = null;
        android.view.View.OnClickListener userViewModelOnClickFabToLoadAndroidViewViewOnClickListener = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (userViewModel != null) {
                        // read userViewModel.progressBar
                        userViewModelProgressBar = userViewModel.progressBar;
                    }
                    updateRegistration(0, userViewModelProgressBar);


                    if (userViewModelProgressBar != null) {
                        // read userViewModel.progressBar.get()
                        userViewModelProgressBarGet = userViewModelProgressBar.get();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (userViewModel != null) {
                        // read userViewModel.userLabel
                        userViewModelUserLabel = userViewModel.userLabel;
                    }
                    updateRegistration(1, userViewModelUserLabel);


                    if (userViewModelUserLabel != null) {
                        // read userViewModel.userLabel.get()
                        userViewModelUserLabelGet = userViewModelUserLabel.get();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (userViewModel != null) {
                        // read userViewModel.userRecycler
                        userViewModelUserRecycler = userViewModel.userRecycler;
                    }
                    updateRegistration(2, userViewModelUserRecycler);


                    if (userViewModelUserRecycler != null) {
                        // read userViewModel.userRecycler.get()
                        userViewModelUserRecyclerGet = userViewModelUserRecycler.get();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (userViewModel != null) {
                        // read userViewModel.messageLabel
                        userViewModelMessageLabel = userViewModel.messageLabel;
                    }
                    updateRegistration(3, userViewModelMessageLabel);


                    if (userViewModelMessageLabel != null) {
                        // read userViewModel.messageLabel.get()
                        userViewModelMessageLabelGet = userViewModelMessageLabel.get();
                    }
            }
            if ((dirtyFlags & 0x30L) != 0) {

                    if (userViewModel != null) {
                        // read userViewModel::onClickFabToLoad
                        userViewModelOnClickFabToLoadAndroidViewViewOnClickListener = (((mUserViewModelOnClickFabToLoadAndroidViewViewOnClickListener == null) ? (mUserViewModelOnClickFabToLoadAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mUserViewModelOnClickFabToLoadAndroidViewViewOnClickListener).setValue(userViewModel));
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.fab.setOnClickListener(userViewModelOnClickFabToLoadAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.labelStatus, userViewModelMessageLabelGet);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            this.labelStatus.setVisibility(userViewModelUserLabelGet);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            this.listUser.setVisibility(userViewModelUserRecyclerGet);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            this.progressBar.setVisibility(userViewModelProgressBarGet);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.universetelecom.mvvm_users.viewModel.UserViewModel value;
        public OnClickListenerImpl setValue(com.universetelecom.mvvm_users.viewModel.UserViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClickFabToLoad(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityUsersBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityUsersBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityUsersBinding>inflate(inflater, com.universetelecom.mvvm_users.R.layout.activity_users, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityUsersBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityUsersBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.universetelecom.mvvm_users.R.layout.activity_users, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityUsersBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityUsersBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_users_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityUsersBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): userViewModel.progressBar
        flag 1 (0x2L): userViewModel.userLabel
        flag 2 (0x3L): userViewModel.userRecycler
        flag 3 (0x4L): userViewModel.messageLabel
        flag 4 (0x5L): userViewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}