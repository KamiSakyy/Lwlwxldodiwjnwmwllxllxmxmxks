package com.github.rudroid.utilities;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ic.qc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n {

    public static final class a {
        public final ViewGroup a;
        public final RecyclerView b;

        public a(ViewGroup viewGroup, RecyclerView recyclerView) {
            this.a = viewGroup;
            this.b = recyclerView;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CodeView(view=" + this.a + ", recyclerView=" + this.b + ")";
        }
    }

    public static final class b {
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return f4.h(this.a, this.b, "CountAndLineWidth(countWidth=", ", lineWidth=", ")");
        }
    }

    public interface c {
        int b();

        int getLineNumber();
    }

    public static a a(boolean z, l7.m0 m0Var, Context context, l7.b1 b1Var, int i, boolean z2) {
        a aVar;
        k71.k.g(m0Var, "adapter");
        if (z) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
            RecyclerView recyclerView = new RecyclerView(context, (AttributeSet) null);
            recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setElevation(recyclerView.getResources().getDimensionPixelSize(2131165314));
            recyclerView.setAdapter(m0Var);
            if (b1Var != null) {
                recyclerView.j(b1Var);
            }
            if (z2) {
                recyclerView.i(new o());
            }
            aVar = new a(recyclerView, recyclerView);
        } else {
            k0 k0Var = new k0(context, null);
            k0Var.setFillViewport(true);
            k0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            k0Var.setElevation(k0Var.getResources().getDimensionPixelSize(2131165314));
            LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(1);
            RecyclerView recyclerView2 = new RecyclerView(context, (AttributeSet) null);
            recyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            recyclerView2.setHasFixedSize(false);
            recyclerView2.setLayoutManager(linearLayoutManager2);
            recyclerView2.setAdapter(m0Var);
            if (b1Var != null) {
                recyclerView2.j(b1Var);
            }
            k0Var.setHostedRecyclerView(recyclerView2);
            k0Var.addView(recyclerView2);
            if (z2) {
                recyclerView2.i(new o());
            }
            aVar = new a(k0Var, recyclerView2);
        }
        if (i > 0) {
            RecyclerView recyclerView3 = aVar.b;
            recyclerView3.setPadding(recyclerView3.getPaddingLeft(), recyclerView3.getPaddingTop(), recyclerView3.getPaddingRight(), i);
            recyclerView3.setClipToPadding(false);
        }
        return aVar;
    }

    public static /* synthetic */ a b(boolean z, l7.m0 m0Var, Context context, l7.b1 b1Var, int i, boolean z2, int i2) {
        boolean z3;
        boolean z4;
        l7.m0 m0Var2;
        Context context2;
        if ((i2 & 8) != 0) {
            b1Var = null;
        }
        l7.b1 b1Var2 = b1Var;
        int i3 = (i2 & 16) != 0 ? 0 : i;
        if ((i2 & 32) != 0) {
            z3 = false;
            m0Var2 = m0Var;
            context2 = context;
            z4 = z;
        } else {
            z3 = z2;
            z4 = z;
            m0Var2 = m0Var;
            context2 = context;
        }
        return a(z4, m0Var2, context2, b1Var2, i3, z3);
    }

    public static int c(TextView textView, List list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof c) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int lineNumber = ((c) next).getLineNumber();
                do {
                    Object next2 = it.next();
                    int lineNumber2 = ((c) next2).getLineNumber();
                    if (lineNumber < lineNumber2) {
                        next = next2;
                        lineNumber = lineNumber2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        c cVar = (c) obj;
        return Math.max(textView.getPaddingEnd() + textView.getPaddingStart() + ((int) textView.getPaint().measureText(String.valueOf(cVar != null ? cVar.getLineNumber() : 0))), textView.getMinWidth());
    }

    public static b d(qc qcVar, ArrayList arrayList, com.github.rudroid.settings.codeoptions.f fVar) {
        Object obj;
        k71.k.g(arrayList, "data");
        k71.k.g(fVar, "codeOptions");
        if (qcVar == null) {
            return new b(0, 0);
        }
        qcVar.P0(fVar);
        qcVar.F0();
        TextView textView = qcVar.P;
        k71.k.f(textView, "lineNumber");
        int c2 = c(textView, arrayList);
        TextView textView2 = qcVar.N;
        k71.k.f(textView2, "line");
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (obj2 instanceof c) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int b2 = ((c) next).b();
                do {
                    Object next2 = it.next();
                    int b3 = ((c) next2).b();
                    if (b2 < b3) {
                        next = next2;
                        b2 = b3;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return new b(c2, Math.max(textView2.getPaddingEnd() + textView2.getPaddingStart() + ((int) (textView2.getPaint().measureText("0") * (((c) obj) != null ? r7.b() : 0) * 1.05f)), textView2.getMinWidth()));
    }

    public static void e(RecyclerView recyclerView, Bundle bundle) {
        String str;
        Integer num;
        k71.k.g(recyclerView, "<this>");
        me.c f = f(recyclerView);
        if (f == null || (str = f.a) == null || (num = f.b) == null) {
            return;
        }
        int intValue = num.intValue();
        bundle.putString("KEY_PINNED_STABLE_ID", str);
        bundle.putInt("KEY_PINNED_OFFSET", intValue);
    }

    public static me.c f(RecyclerView recyclerView) {
        int S0;
        k71.k.g(recyclerView, "<this>");
        LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? layoutManager : null;
        if (linearLayoutManager == null) {
            return null;
        }
        ya.b adapter = recyclerView.getAdapter();
        ya.b bVar = adapter instanceof ya.b ? adapter : null;
        if (bVar == null || (S0 = linearLayoutManager.S0()) < 0 || S0 >= ((ArrayList) bVar.getData()).size()) {
            return null;
        }
        me.c cVar = new me.c();
        cVar.d(recyclerView, ((le.z) ((ArrayList) bVar.getData()).get(S0)).E(), bVar.getData());
        return cVar;
    }

    public static void g(xa.k kVar, a aVar) {
        k71.k.g(kVar, "adapter");
        k71.k.g(aVar, "codeView");
        ViewGroup viewGroup = aVar.a;
        kVar.q = viewGroup.getWidth();
        kVar.n();
        kVar.p = 0.0f;
        Iterator it = kVar.j.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setTranslationX(kVar.p);
        }
        k0 k0Var = viewGroup instanceof k0 ? (k0) viewGroup : null;
        if (k0Var != null) {
            k0Var.setOnScrollChangeListener(new com.github.rudroid.commit.c(3, kVar));
        }
    }

    public static me.c h(Bundle bundle) {
        me.c cVar = new me.c();
        if (bundle != null) {
            String string = bundle.getString("KEY_PINNED_STABLE_ID");
            Integer valueOf = bundle.containsKey("KEY_PINNED_OFFSET") ? Integer.valueOf(bundle.getInt("KEY_PINNED_OFFSET")) : null;
            if (string != null && valueOf != null) {
                cVar.a = string;
                cVar.b = valueOf;
            }
        }
        if (cVar.a()) {
            return cVar;
        }
        return null;
    }



}
