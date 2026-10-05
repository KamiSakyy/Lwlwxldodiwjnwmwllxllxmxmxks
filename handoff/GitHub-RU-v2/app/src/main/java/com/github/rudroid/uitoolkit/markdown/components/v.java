package com.github.rudroid.uitoolkit.markdown.components;

import a0.a2;
import android.view.View;
import androidx.compose.runtime.i3;
import androidx.lifecycle.c0;
import com.github.rudroid.copilot.u4;
import com.github.rudroid.discussions.i5;
import com.github.rudroid.repository.files.m;
import com.github.rudroid.uitoolkit.text.h0;
import com.github.rudroid.uitoolkit.utils.lists.i0;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.s1;
import com.github.rudroid.viewmodels.issuesorpullrequests.c6;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.github.service.models.response.shortcuts.ShortcutType;
import d1.h1;
import f1.e8;
import f1.l2;
import f1.w3;
import f1.z9;
import g3.q0;
import java.util.List;
import java.util.Map;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class v implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    public /* synthetic */ v(int i, int i2, int i3, Object obj, Object obj2, w61.e eVar) {
        this.r = i3;
        this.s = obj;
        this.u = i;
        this.v = eVar;
        this.t = obj2;
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Integer) obj2).getClass();
                a0.a((w1.r) this.s, (g3.g) this.v, (q0) this.t, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(this.u | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                h0.a((w1.r) this.s, (String) this.v, (q0) this.t, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1), this.u);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int L = androidx.compose.runtime.t.L(1);
                i0.a((o0.b) this.s, this.u, (j71.a) this.v, (j71.a) this.t, (androidx.compose.runtime.s) obj, L);
                break;
            case 3:
                ((Integer) obj2).intValue();
                s1.b((m0.s) this.s, (g1) this.v, (i3) this.t, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(this.u | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                com.github.rudroid.utilities.ui.emojipicker.t.b((String) this.s, (j71.c) this.v, (r1.d) this.t, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(this.u | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                int L2 = androidx.compose.runtime.t.L(1);
                ((d0.c) this.s).a((a2) this.v, (d0.v) this.t, this.u, (androidx.compose.runtime.s) obj, L2);
                break;
            case 6:
                ((Integer) obj2).getClass();
                h1.a((d1.n) this.s, (w1.e) this.v, (r1.d) this.t, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(this.u | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                dc.l.a((u4.c) this.v, (j71.a) this.t, (w1.r) this.s, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(this.u | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                dc.n.a((u4.a) this.v, (j71.e) this.t, (w1.r) this.s, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(this.u | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                dc.s.a((u4.g) this.v, (j71.a) this.t, (w1.r) this.s, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(this.u | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                ef.d.b((w1.r) this.s, (j71.a) this.v, (l01.x) this.t, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(this.u | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                int L3 = androidx.compose.runtime.t.L(7);
                w3.f((w1.r) this.s, this.u, (j71.c) this.v, (l2) this.t, (androidx.compose.runtime.s) obj, L3);
                break;
            case 12:
                ((Integer) obj2).intValue();
                e8.o((View) this.s, (s3.c) this.v, (j71.a) this.t, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(this.u | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                e8.f((z9) this.v, (w1.r) this.s, (j71.f) this.t, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(this.u | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                g0.f.b((w1.r) this.s, (g0.c) this.v, (j71.c) this.t, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(1), this.u);
                break;
            case 15:
                ((Integer) obj2).getClass();
                g0.f.a((g0.c) this.v, (w1.r) this.s, (r1.d) this.t, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(this.u | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                he.p.a((w1.r) this.s, (j71.a) this.v, (c6) this.t, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(this.u | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                hg.b.a((w1.r) this.s, (j71.c) this.v, (ShortcutColor) this.t, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(this.u | 1));
                break;
            case 18:
                ((Integer) obj2).intValue();
                hg.g.b((com.github.service.models.response.shortcuts.a) this.s, (j71.c) this.v, (j71.a) this.t, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(this.u | 1));
                break;
            case 19:
                ((Integer) obj2).intValue();
                hg.g.c((ShortcutType) this.s, (List) this.v, (j71.c) this.t, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(this.u | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                b31.b.a((z5.n) this.s, (i6.c) this.v, (r1.d) this.t, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(385), this.u);
                break;
            case 21:
                ((Integer) obj2).getClass();
                ne.b.a((Map) this.v, (j71.a) this.t, (w1.r) this.s, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(this.u | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                nf.l.a((w1.r) this.s, (j71.a) this.v, (m.d) this.t, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(this.u | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                pc.x.a((w1.r) this.s, (j71.c) this.v, (i5) this.t, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(this.u | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                qd.q.a((w1.r) this.s, (j71.a) this.v, (hd.a) this.t, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(this.u | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                qf.c.a((w1.r) this.s, (j71.c) this.v, (com.github.rudroid.utilities.viewmodel.paging.model.x) this.t, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(this.u | 1));
                break;
            case 26:
                ((Integer) obj2).intValue();
                int L4 = androidx.compose.runtime.t.L(this.u) | 1;
                ((r1.d) this.s).i(this.v, this.t, (androidx.compose.runtime.s) obj, L4);
                break;
            case 27:
                ((Integer) obj2).getClass();
                int L5 = androidx.compose.runtime.t.L(this.u | 1);
                m7.y.b(this.s, (c0) this.v, (j71.c) this.t, (androidx.compose.runtime.s) obj, L5);
                break;
            case 28:
                ((Integer) obj2).intValue();
                m7.y.c((c0) this.s, (r6.d) this.v, (j71.c) this.t, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(this.u | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                m7.y.e((c0) this.s, (r6.e) this.v, (j71.c) this.t, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(this.u | 1));
                break;
        }
        return w61.a0.a;
    }

    public /* synthetic */ v(d0.c cVar, a2 a2Var, d0.v vVar, int i, int i2) {
        this.r = 5;
        this.s = cVar;
        this.v = a2Var;
        this.t = vVar;
        this.u = i;
    }

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.r = i2;
        this.s = obj;
        this.v = obj2;
        this.t = obj3;
        this.u = i;
    }

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.r = i3;
        this.s = obj;
        this.v = obj2;
        this.t = obj3;
        this.u = i2;
    }

    public /* synthetic */ v(Object obj, w1.r rVar, j71.f fVar, int i, int i2) {
        this.r = i2;
        this.v = obj;
        this.s = rVar;
        this.t = fVar;
        this.u = i;
    }

    public /* synthetic */ v(Object obj, w61.e eVar, w1.r rVar, int i, int i2) {
        this.r = i2;
        this.v = obj;
        this.t = eVar;
        this.s = rVar;
        this.u = i;
    }
}
