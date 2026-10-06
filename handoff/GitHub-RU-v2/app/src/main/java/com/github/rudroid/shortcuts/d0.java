package com.github.rudroid.shortcuts;

import a5.c1;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.github.rudroid.shortcuts.activities.ShortcutsOverviewFragment;
import com.github.rudroid.shortcuts.activities.x0;
import com.github.rudroid.shortcuts.q;
import com.github.rudroid.utilities.b;
import com.github.rudroid.utilities.m2;
import com.google.android.material.imageview.ShapeableImageView;
import ic.bg;
import ic.jg;
import ic.me;
import ic.y5;
import ic.z7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d0 extends l7.m0 implements jf.c {
    public static final /* synthetic */ r71.e[] m;
    public ShortcutsOverviewFragment d;
    public ShortcutsOverviewFragment e;
    public x0 f;
    public ShortcutsOverviewFragment g;
    public Context h;
    public final w61.p i = sy.w.t(new com.github.rudroid.projects.triagesheet.singleselectionvaluepicker.j(19, this));
    public final y1 j = n1.c(Boolean.FALSE);
    public final c0 k = new c0(this);
    public final m2 l = new m2();

    static {
        r71.e mVar = new k71.m(d0.class, "data", "getData()Ljava/util/List;", 0);
        k71.x.a.getClass();
        m = new r71.e[]{mVar};
    }

    public d0(ShortcutsOverviewFragment shortcutsOverviewFragment, ShortcutsOverviewFragment shortcutsOverviewFragment2, x0 x0Var, ShortcutsOverviewFragment shortcutsOverviewFragment3, Context context) {
        this.d = shortcutsOverviewFragment;
        this.e = shortcutsOverviewFragment2;
        this.f = x0Var;
        this.g = shortcutsOverviewFragment3;
        this.h = context;
        D(true);
    }

    public final boolean a(int i, int i2) {
        if (!b(i2)) {
            return false;
        }
        Object obj = getData().get(i);
        k71.k.e(obj, "null cannot be cast to non-null type com.github.rudroid.shortcuts.ListItemShortcutsOverview.SavedShortcut");
        q.e eVar = (q.e) obj;
        Collections.swap(getData(), i, i2);
        p(i, i2);
        com.github.rudroid.utilities.b.Companion.getClass();
        Context context = this.h;
        if (b.a.a(context)) {
            o(i);
            o(i2);
        }
        List data = getData();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : data) {
            if (obj2 instanceof q.e) {
                arrayList.add(obj2);
            }
        }
        ((com.github.rudroid.utilities.b) this.i.getValue()).a(context, i2, arrayList.size(), new com.github.rudroid.projects.triagesheet.triagebottomsheets.compose.e(22, this, arrayList));
        ShortcutsOverviewFragment shortcutsOverviewFragment = this.g;
        shortcutsOverviewFragment.getClass();
        k71.k.g(eVar, "selectedItem");
        y1 y1Var = shortcutsOverviewFragment.J4().z;
        List list = (List) y1Var.getValue();
        int indexOf = list.indexOf(eVar.t);
        int i3 = (i2 - i) + indexOf;
        if (list.size() < i3) {
            return true;
        }
        ArrayList H0 = x61.m.H0(list);
        Collections.swap(H0, indexOf, i3);
        y1Var.k((Object) null, H0);
        return true;
    }

    public final boolean b(int i) {
        return i >= 0 && i < getData().size() && (getData().get(i) instanceof q.e);
    }

    public final void c(int i) {
    }

    public final List getData() {
        return (List) this.k.t(this, m[0]);
    }

    public final int k() {
        return getData().size();
    }

    public final long l(int i) {
        return this.l.a(((q) getData().get(i)).s);
    }

    public final int m(int i) {
        return ((q) getData().get(i)).r;
    }

    public final void v(l7.n1 n1Var, int i) {
        jg.f fVar = (jg.f) n1Var;
        q qVar = (q) getData().get(i);
        if (qVar instanceof q.d) {
            jg.i iVar = fVar instanceof jg.i ? (jg.i) fVar : null;
            if (iVar != null) {
                bg bgVar = ((com.github.rudroid.adapters.viewholders.e) iVar).u;
                k71.k.e(bgVar, "null cannot be cast to non-null type com.github.rudroid.databinding.ListItemShortcutOverviewHeaderBinding");
                bg bgVar2 = bgVar;
                bgVar2.N.setText(((k5.f) bgVar2).A.getContext().getString(((q.d) qVar).t));
                return;
            }
            return;
        }
        if (!(qVar instanceof q.e)) {
            if (!(qVar instanceof q.f)) {
                if (!k71.k.b(qVar, q.b.t) && !k71.k.b(qVar, q.c.t)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            jg.j jVar = fVar instanceof jg.j ? (jg.j) fVar : null;
            if (jVar != null) {
                wm.b bVar = ((q.f) qVar).t;
                k71.k.g(bVar, "item");
                jg jgVar = ((com.github.rudroid.adapters.viewholders.e) jVar).u;
                k71.k.e(jgVar, "null cannot be cast to non-null type com.github.rudroid.databinding.ListItemSuggestedShortcutOverviewBinding");
                jg jgVar2 = jgVar;
                View view = ((k5.f) jgVar2).A;
                Context context = view.getContext();
                ShapeableImageView shapeableImageView = jgVar2.O;
                k71.k.d(context);
                shapeableImageView.setImageDrawable(com.github.rudroid.utilities.q.e(r.e(bVar.getIcon()), r.f(bVar.f()), context));
                Resources resources = context.getResources();
                int d = r.d(bVar.f());
                Resources.Theme theme = context.getTheme();
                ThreadLocal threadLocal = q4.l.a;
                shapeableImageView.setBackgroundColor(resources.getColor(d, theme));
                jgVar2.Q.setText(bVar.getName());
                jgVar2.P.setText(r.i(bVar.i(), context, bVar.K()));
                view.setOnClickListener(new cd.n(22, jVar, bVar));
                view.setContentDescription(r.b(bVar, context));
                com.github.rudroid.utilities.b.Companion.getClass();
                b.a.c(view, 2131953625);
                return;
            }
            return;
        }
        final jg.e eVar = fVar instanceof jg.e ? (jg.e) fVar : null;
        if (eVar != null) {
            final wm.b bVar2 = ((q.e) qVar).t;
            d0 d0Var = eVar.v;
            k71.k.g(bVar2, "item");
            me meVar = ((com.github.rudroid.adapters.viewholders.e) eVar).u;
            k71.k.e(meVar, "null cannot be cast to non-null type com.github.rudroid.databinding.ListItemSavedShortcutOverviewBinding");
            me meVar2 = meVar;
            ImageButton imageButton = meVar2.O;
            View view2 = ((k5.f) meVar2).A;
            ic.a aVar = meVar2.T;
            Context context2 = view2.getContext();
            final int i2 = 0;
            view2.setOnClickListener(new View.OnClickListener() { // from class: jg.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i2) {
                        case 0:
                            eVar.w.h3(bVar2);
                            break;
                        default:
                            eVar.w.a2(bVar2);
                            break;
                    }
                }
            });
            ShapeableImageView shapeableImageView2 = meVar2.P;
            k71.k.d(context2);
            shapeableImageView2.setImageDrawable(com.github.rudroid.utilities.q.e(r.e(bVar2.getIcon()), r.f(bVar2.f()), context2));
            Resources resources2 = context2.getResources();
            int d2 = r.d(bVar2.f());
            Resources.Theme theme2 = context2.getTheme();
            ThreadLocal threadLocal2 = q4.l.a;
            shapeableImageView2.setBackgroundColor(resources2.getColor(d2, theme2));
            meVar2.S.setText(bVar2.getName());
            meVar2.R.setText(r.i(bVar2.i(), context2, bVar2.K()));
            view2.setContentDescription(r.b(bVar2, context2));
            ImageView imageView = meVar2.Q;
            final int i3 = 1;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: jg.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i3) {
                        case 0:
                            eVar.w.h3(bVar2);
                            break;
                        default:
                            eVar.w.a2(bVar2);
                            break;
                    }
                }
            });
            imageView.setContentDescription(context2.getString(2131954066));
            com.github.rudroid.utilities.b.Companion.getClass();
            b.a.c(imageView, 2131954063);
            if (!b.a.a(context2) && !((Boolean) d0Var.j.getValue()).booleanValue()) {
                k71.k.f(imageButton, "dragHandle");
                imageButton.setVisibility(0);
                LinearLayout linearLayout = aVar.P;
                k71.k.f(linearLayout, "upDownContainer");
                linearLayout.setVisibility(8);
                return;
            }
            k71.k.f(imageButton, "dragHandle");
            imageButton.setVisibility(8);
            LinearLayout linearLayout2 = aVar.P;
            ImageButton imageButton2 = aVar.N;
            ImageButton imageButton3 = aVar.O;
            k71.k.f(linearLayout2, "upDownContainer");
            linearLayout2.setVisibility(0);
            imageButton3.setEnabled(d0Var.b(eVar.i() - 1));
            imageButton3.setContentDescription(view2.getResources().getString(2131953917));
            imageButton2.setEnabled(d0Var.b(eVar.i() + 1));
            imageButton2.setContentDescription(view2.getResources().getString(2131953916));
        }
    }

    public final l7.n1 w(ViewGroup viewGroup, int i) {
        if (i == 0) {
            y5 b = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559140, viewGroup, false, k5.b.b);
            k71.k.f(b, "inflate(...)");
            y5 y5Var = b;
            x0 x0Var = this.f;
            k71.k.g(x0Var, "callback");
            jg.g gVar = new jg.g(y5Var);
            View view = ((k5.f) y5Var).A;
            view.setOnClickListener(new com.github.rudroid.actions.checklog.c(16, x0Var));
            c1.n(y5Var.N, b5.b.e, view.getContext().getString(2131954136), new c5.b(15, x0Var));
            return gVar;
        }
        if (i == 1) {
            z7 b2 = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559167, viewGroup, false, k5.b.b);
            k71.k.f(b2, "inflate(...)");
            return new jg.h(b2);
        }
        if (i == 2) {
            bg b3 = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559273, viewGroup, false, k5.b.b);
            k71.k.f(b3, "inflate(...)");
            return new jg.i(b3);
        }
        if (i == 3) {
            me b4 = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559253, viewGroup, false, k5.b.b);
            k71.k.f(b4, "inflate(...)");
            return new jg.e(b4, this.g, this, this.e);
        }
        if (i == 4) {
            jg b5 = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559277, viewGroup, false, k5.b.b);
            k71.k.f(b5, "inflate(...)");
            return new jg.j(b5, this.d);
        }
        throw new IllegalStateException(("Unimplemented list item type " + i).toString());
    }
    public Object n() { return null; }
    public Object r(Object p1, Object p2) { return null; }
    public Object s(Object p1, Object p2) { return null; }
    public Object D(boolean) { return null; }
    public Object o(int) { return null; }
    public Object p(int, int) { return null; }
}
