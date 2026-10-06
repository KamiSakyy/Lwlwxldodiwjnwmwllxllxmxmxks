package ph;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.databinding.DataBinderMapperImpl;
import k5.f;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public class b extends BaseAdapter {

    public static final class a {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "LocalizedPopupMenuItem(title=null, isEnabled=false)";
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        throw null;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        throw null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        k.g(viewGroup, "parent");
        if (view == null) {
            view = ((f) k5.b.b((LayoutInflater) null, 2131559182, viewGroup, false, k5.b.b)).A;
            k.f(view, "getRoot(...)");
        }
        DataBinderMapperImpl dataBinderMapperImpl = k5.b.a;
        f.G0(view);
        throw null;
    }
    public static final Object a = null;
}
