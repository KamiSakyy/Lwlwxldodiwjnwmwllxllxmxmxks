package e50;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.github.domain.searchandfilter.filters.data.ProjectOrderFilter;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.z6;
import com.google.android.material.tabs.TabLayout;
import hc0.o8;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public class z0 implements aa.i0, t6.b, bm.k, com.google.android.gms.measurement.internal.x {
    public static final /* synthetic */ z0 s = new z0(3);
    public static final /* synthetic */ z0 t = new z0(4);
    public static final /* synthetic */ z0 u = new z0(5);
    public static final /* synthetic */ z0 v = new z0(6);
    public final /* synthetic */ int r;

    public /* synthetic */ z0(int i) {
        this.r = i;
    }

    public static RectF a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.V || !(view instanceof x31.j)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        x31.j jVar = (x31.j) view;
        int contentWidth = jVar.getContentWidth();
        int contentHeight = jVar.getContentHeight();
        int d = (int) o31.o.d(jVar.getContext(), 24);
        if (contentWidth < d) {
            contentWidth = d;
        }
        int right = (jVar.getRight() + jVar.getLeft()) / 2;
        int bottom = (jVar.getBottom() + jVar.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
    }

    public void b(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF a = a(tabLayout, view);
        RectF a2 = a(tabLayout, view2);
        drawable.setBounds(y21.a.c((int) a.left, f, (int) a2.left), drawable.getBounds().top, y21.a.c((int) a.right, f, (int) a2.right), drawable.getBounds().bottom);
    }

    public Object c() {
        switch (this.r) {
            case 3:
                List list = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                return Integer.valueOf((int) ((Long) b7.q0.b()).longValue());
            case 4:
                List list2 = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                Long l = (Long) b7.p0.b();
                l.getClass();
                return l;
            case 5:
                List list3 = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                return Integer.valueOf((int) ((Long) b7.W.b()).longValue());
            default:
                List list4 = com.google.android.gms.measurement.internal.c0.a;
                z6.s.a();
                Long l2 = (Long) b7.a.b();
                l2.getClass();
                return l2;
        }
    }

    public aa.m d() {
        o8.Companion.getClass();
        aa.q0 q0Var = o8.l;
        k71.k.g(q0Var, "type");
        List list = f50.f.a;
        List list2 = f50.f.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == z0.class;
            default:
                return super.equals(obj);
        }
    }

    public aa.p0 g() {
        return aa.c.c(a1.a, false);
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.xShadow.a(z0.class).hashCode();
            default:
                return super.hashCode();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0018, code lost:
    
        if (r5 == null) goto L5;
     */
    @Override // bm.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.github.domain.searchandfilter.filters.data.d l(String str) {
        com.github.rudroid.common.d0 d0Var;
        if (str != null) {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            d0Var = (com.github.rudroid.common.d0) bVar.a(str, new k81.z("com.github.rudroid.common.ProjectOrder", com.github.rudroid.common.d0.values()));
        }
        d0Var = ProjectOrderFilter.x;
        return new ProjectOrderFilter(d0Var);
    }

    public void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
