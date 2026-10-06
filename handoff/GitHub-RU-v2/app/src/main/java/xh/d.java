package xh;

import android.R;
import android.view.LayoutInflater;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.github.rudroid.views.listemptystate.a;
import com.github.rudroid.views.refreshableviews.SwipeRefreshUiStateRecyclerView;
import k.i;
import k5.f;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d<T extends f> extends SwipeRefreshLayout {
    public f j0;

    public static void p(SwipeRefreshUiStateRecyclerView swipeRefreshUiStateRecyclerView, fl.f fVar, i iVar, j71.a aVar) {
        com.github.rudroid.views.listemptystate.a.Companion.getClass();
        swipeRefreshUiStateRecyclerView.r(fVar, iVar, aVar, a.C0021a.b);
    }

    public final T getDataBinding() {
        T t = (T) this.j0;
        if (t != null) {
            return t;
        }
        k.m("dataBinding");
        throw null;
    }

    public abstract int getLayoutResId();

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        setProgressBackgroundColorSchemeResource(2131099743);
        setColorSchemeResources(new int[]{R.color.white});
        int progressViewStartOffset = getProgressViewStartOffset();
        int progressViewEndOffset = getProgressViewEndOffset();
        ((SwipeRefreshLayout) this).J = true;
        ((SwipeRefreshLayout) this).P = progressViewStartOffset;
        ((SwipeRefreshLayout) this).Q = progressViewEndOffset;
        ((SwipeRefreshLayout) this).d0 = true;
        l();
        ((SwipeRefreshLayout) this).t = false;
        f b = k5.b.b(LayoutInflater.from(getContext()), getLayoutResId(), this, false, k5.b.b);
        k.f(b, "inflate(...)");
        setDataBinding(b);
        addView(getDataBinding().A);
    }

    public final void setDataBinding(T t) {
        k.g(t, "<set-?>");
        this.j0 = t;
    }


    public Object setOnRefreshListener(Object p1) { return null; }
    public Object setColorSchemeResources(Object p1) { return null; }
    public Object setProgressBackgroundColorSchemeResource(int p1) { return null; }
}
