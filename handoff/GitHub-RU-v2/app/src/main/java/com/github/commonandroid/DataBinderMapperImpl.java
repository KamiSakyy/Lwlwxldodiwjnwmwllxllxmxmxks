package com.github.commonandroid;

import a0.s0;
import a5.s;
import android.util.SparseIntArray;
import android.view.View;
import ci.b;
import ci.c;
import ci.d;
import com.github.commonandroid.views.ScrollableTitleToolbar;
import com.google.android.material.appbar.AppBarLayout;
import ic.i4;
import java.util.ArrayList;
import java.util.List;
import k5.a;
import k5.f;

/* loaded from: /home/user/work/p/classes3.dex */
public class DataBinderMapperImpl extends a {
    public static final SparseIntArray a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        a = sparseIntArray;
        sparseIntArray.put(2131558453, 1);
        sparseIntArray.put(2131559958, 2);
        sparseIntArray.put(2131559959, 3);
    }

    public final List a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    public final f b(i4 i4Var, View view, int i) {
        int i2 = a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i2 == 1) {
                if (!"layout/app_bar_layout_0".equals(tag)) {
                    throw new IllegalArgumentException(s0.h(tag, "The tag for app_bar_layout is invalid. Received: "));
                }
                Object[] K0 = f.K0(i4Var, view, 2, b.Q, (SparseIntArray) null);
                b bVar = new b(i4Var, view, (AppBarLayout) K0[0], (c) K0[1]);
                bVar.P = -1L;
                bVar.N.setTag(null);
                c cVar = bVar.O;
                if (cVar != null) {
                    ((f) cVar).G = bVar;
                }
                view.setTag(2131362201, bVar);
                bVar.I0();
                return bVar;
            }
            if (i2 == 2) {
                if (!"layout/toolbar_0".equals(tag)) {
                    throw new IllegalArgumentException(s0.h(tag, "The tag for toolbar is invalid. Received: "));
                }
                Object[] K02 = f.K0(i4Var, view, 5, (s) null, d.P);
                ScrollableTitleToolbar scrollableTitleToolbar = (ScrollableTitleToolbar) K02[0];
                d dVar = new d(i4Var, view, scrollableTitleToolbar);
                dVar.O = -1L;
                dVar.N.setTag(null);
                view.setTag(2131362201, dVar);
                dVar.I0();
                return dVar;
            }
            if (i2 == 3) {
                if (!"layout/toolbar_multi_line_0".equals(tag)) {
                    throw new IllegalArgumentException(s0.h(tag, "The tag for toolbar_multi_line is invalid. Received: "));
                }
                Object[] K03 = f.K0(i4Var, view, 5, (s) null, ci.f.P);
                ScrollableTitleToolbar scrollableTitleToolbar2 = (ScrollableTitleToolbar) K03[0];
                ci.f fVar = new ci.f(i4Var, view, scrollableTitleToolbar2);
                fVar.O = -1L;
                fVar.N.setTag(null);
                view.setTag(2131362201, fVar);
                fVar.I0();
                return fVar;
            }
        }
        return null;
    }

    public final f c(i4 i4Var, View[] viewArr, int i) {
        if (viewArr.length != 0 && a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class f<T1,T2,T3,T4> {
        public f() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class i4<T1,T2,T3,T4> {
        public i4() {
        }
    }
}
