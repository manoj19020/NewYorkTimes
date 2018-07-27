package com.newyork.times.databinding;
import com.newyork.times.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemUserBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    public final de.hdodenhof.circleimageview.CircleImageView imagePeople;
    @NonNull
    public final android.support.v7.widget.CardView itemPeople;
    @NonNull
    public final android.widget.TextView labelMail;
    @NonNull
    public final android.widget.TextView labelName;
    @NonNull
    public final android.widget.TextView labelPhone;
    // variables
    @Nullable
    private com.newyork.times.viewModel.ItemUserViewModel mUserViewModel;
    // values
    // listeners
    private OnClickListenerImpl mUserViewModelOnItemClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ItemUserBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.imagePeople = (de.hdodenhof.circleimageview.CircleImageView) bindings[1];
        this.imagePeople.setTag(null);
        this.itemPeople = (android.support.v7.widget.CardView) bindings[0];
        this.itemPeople.setTag(null);
        this.labelMail = (android.widget.TextView) bindings[4];
        this.labelMail.setTag(null);
        this.labelName = (android.widget.TextView) bindings[2];
        this.labelName.setTag(null);
        this.labelPhone = (android.widget.TextView) bindings[3];
        this.labelPhone.setTag(null);
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
        if (BR.userViewModel == variableId) {
            setUserViewModel((com.newyork.times.viewModel.ItemUserViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUserViewModel(@Nullable com.newyork.times.viewModel.ItemUserViewModel UserViewModel) {
        updateRegistration(0, UserViewModel);
        this.mUserViewModel = UserViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.userViewModel);
        super.requestRebind();
    }
    @Nullable
    public com.newyork.times.viewModel.ItemUserViewModel getUserViewModel() {
        return mUserViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeUserViewModel((com.newyork.times.viewModel.ItemUserViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeUserViewModel(com.newyork.times.viewModel.ItemUserViewModel UserViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.lang.String userViewModelEmail = null;
        java.lang.String userViewModelProfileThumb = null;
        java.lang.String userViewModelCell = null;
        java.lang.String userViewModelFullName = null;
        android.view.View.OnClickListener userViewModelOnItemClickAndroidViewViewOnClickListener = null;
        com.newyork.times.viewModel.ItemUserViewModel userViewModel = mUserViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (userViewModel != null) {
                    // read userViewModel.email
                    userViewModelEmail = userViewModel.getEmail();
                    // read userViewModel.profileThumb
                    userViewModelProfileThumb = userViewModel.getProfileThumb();
                    // read userViewModel.cell
                    userViewModelCell = userViewModel.getCell();
                    // read userViewModel.fullName
                    userViewModelFullName = userViewModel.getFullName();
                    // read userViewModel::onItemClick
                    userViewModelOnItemClickAndroidViewViewOnClickListener = (((mUserViewModelOnItemClickAndroidViewViewOnClickListener == null) ? (mUserViewModelOnItemClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mUserViewModelOnItemClickAndroidViewViewOnClickListener).setValue(userViewModel));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.newyork.times.viewModel.UserDetailViewModel.loadImage(this.imagePeople, userViewModelProfileThumb);
            this.itemPeople.setOnClickListener(userViewModelOnItemClickAndroidViewViewOnClickListener);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.labelMail, userViewModelEmail);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.labelName, userViewModelFullName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.labelPhone, userViewModelCell);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.newyork.times.viewModel.ItemUserViewModel value;
        public OnClickListenerImpl setValue(com.newyork.times.viewModel.ItemUserViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onItemClick(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemUserBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemUserBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemUserBinding>inflate(inflater, com.newyork.times.R.layout.item_user, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemUserBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemUserBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.newyork.times.R.layout.item_user, null, false), bindingComponent);
    }
    @NonNull
    public static ItemUserBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemUserBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_user_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemUserBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): userViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}