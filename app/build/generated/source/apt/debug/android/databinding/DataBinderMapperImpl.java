
package android.databinding;
import com.universetelecom.mvvm_users.BR;
class DataBinderMapperImpl extends android.databinding.DataBinderMapper {
    public DataBinderMapperImpl() {
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.universetelecom.mvvm_users.R.layout.activity_user_detail:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_user_detail_0".equals(tag)) {
                            return new com.universetelecom.mvvm_users.databinding.ActivityUserDetailBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_user_detail is invalid. Received: " + tag);
                }
                case com.universetelecom.mvvm_users.R.layout.activity_users:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/activity_users_0".equals(tag)) {
                            return new com.universetelecom.mvvm_users.databinding.ActivityUsersBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for activity_users is invalid. Received: " + tag);
                }
                case com.universetelecom.mvvm_users.R.layout.item_user:
 {
                        final Object tag = view.getTag();
                        if(tag == null) throw new java.lang.RuntimeException("view must have a tag");
                    if ("layout/item_user_0".equals(tag)) {
                            return new com.universetelecom.mvvm_users.databinding.ItemUserBinding(bindingComponent, view);
                    }
                        throw new java.lang.IllegalArgumentException("The tag for item_user is invalid. Received: " + tag);
                }
        }
        return null;
    }
    @Override
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    @Override
    public int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case 1706009867: {
                if(tag.equals("layout/activity_user_detail_0")) {
                    return com.universetelecom.mvvm_users.R.layout.activity_user_detail;
                }
                break;
            }
            case -726691122: {
                if(tag.equals("layout/activity_users_0")) {
                    return com.universetelecom.mvvm_users.R.layout.activity_users;
                }
                break;
            }
            case -1243181053: {
                if(tag.equals("layout/item_user_0")) {
                    return com.universetelecom.mvvm_users.R.layout.item_user;
                }
                break;
            }
        }
        return 0;
    }
    @Override
    public String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"userDetailViewModel"
            ,"userViewModel"};
    }
}