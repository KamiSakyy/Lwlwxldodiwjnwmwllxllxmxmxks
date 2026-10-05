package la0;

import aa.i0;
import aa.j0;
import aa.m;
import aa.p0;
import aa.w;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import bm.k;
import com.github.domain.searchandfilter.filters.data.PullRequestUserRelationshipFilter;
import com.github.rudroid.common.h0;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z6;
import com.google.android.gms.measurement.internal.c0;
import com.google.android.gms.measurement.internal.x;
import hc0.k00;
import java.util.List;
import k81.z;
import sy.p;
import u31.n;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements i0, t6.b, k, x {
    public static final /* synthetic */ d s = new d(3);
    public static final /* synthetic */ d t = new d(4);
    public static final /* synthetic */ d u = new d(5);
    public final /* synthetic */ int r;

    public /* synthetic */ d(int i) {
        this.r = i;
    }

    public static d a(Context context, int i) {
        p.g("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, x21.a.u);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        i4.W(context, obtainStyledAttributes, 4);
        i4.W(context, obtainStyledAttributes, 9);
        i4.W(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        n.a(obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), context).a();
        obtainStyledAttributes.recycle();
        d dVar = new d(6);
        p.h(rect.left);
        p.h(rect.top);
        p.h(rect.right);
        p.h(rect.bottom);
        return dVar;
    }

    public Object c() {
        switch (this.r) {
            case 3:
                List list = c0.a;
                z6.s.a();
                return (String) b7.N.b();
            case 4:
                List list2 = c0.a;
                z6.s.a();
                Long l = (Long) b7.H.b();
                l.getClass();
                return l;
            default:
                List list3 = c0.a;
                z6.s.a();
                Boolean bool = (Boolean) b7.C.b();
                bool.getClass();
                return bool;
        }
    }

    public m d() {
        k00.Companion.getClass();
        j0 j0Var = k00.a;
        k71.k.g(j0Var, "type");
        List list = ma0.a.a;
        List list2 = ma0.a.a;
        k71.k.g(list2, "selections");
        r rVar = r.r;
        return new m("data", j0Var, (String) null, rVar, rVar, list2);
    }

    public boolean equals(Object obj) {
        switch (this.r) {
            case 0:
                return obj != null && obj.getClass() == d.class;
            default:
                return super.equals(obj);
        }
    }

    public p0 g() {
        return aa.c.c(e.a, true);
    }

    public int hashCode() {
        switch (this.r) {
            case 0:
                return k71.x.a(d.class).hashCode();
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
        h0 h0Var;
        if (str != null) {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            h0Var = (h0) bVar.a(str, new z("com.github.rudroid.common.PullRequestUserRelationship", h0.values()));
        }
        h0Var = PullRequestUserRelationshipFilter.x;
        return new PullRequestUserRelationshipFilter(h0Var);
    }

    public void o(ea.f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }



}
