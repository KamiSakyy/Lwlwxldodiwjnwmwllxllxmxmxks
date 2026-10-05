package com.github.rudroid.support;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import androidx.lifecycle.l1;
import com.github.rudroid.support.a;
import com.github.rudroid.support.d;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.h0;
import com.github.rudroid.utilities.w0;
import com.google.android.material.textfield.TextInputEditText;
import ic.e4;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import sy.d0;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class SupportFragment extends Hilt_SupportFragment<e4> implements a.InterfaceC0007a, d.a {
    public static final a Companion = new a();
    public final int E0 = 2131558813;
    public final l1 F0 = new l1(k71.x.a(s.class), new c(), new e(), new d());
    public final com.github.rudroid.support.e G0 = new com.github.rudroid.support.e(this, this);

    public static final class a {
    }

    public static final /* synthetic */ class b {
        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                g gVar = g.r;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                g gVar2 = g.r;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                g gVar3 = g.r;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class c extends k71.l implements j71.a {
        public c() {
            super(0);
        }

        public final Object a() {
            return SupportFragment.this.g4().K0();
        }
    }

    public static final class d extends k71.l implements j71.a {
        public d() {
            super(0);
        }

        public final Object a() {
            return SupportFragment.this.g4().g0();
        }
    }

    public static final class e extends k71.l implements j71.a {
        public e() {
            super(0);
        }

        public final Object a() {
            return SupportFragment.this.g4().f0();
        }
    }

    public static final int I4(SupportFragment supportFragment, g gVar) {
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            return 2131954745;
        }
        if (ordinal == 1) {
            return 2131954744;
        }
        if (ordinal == 2) {
            return 2131954743;
        }
        if (ordinal == 3) {
            return 2131954742;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int C4() {
        return this.E0;
    }

    public final s J4() {
        return (s) this.F0.getValue();
    }

    public final void M3(int i, int i2, Intent intent) {
        Object value;
        h a2;
        super/*androidx.fragment.app.a0*/.M3(i, i2, intent);
        Uri data = intent != null ? intent.getData() : null;
        if (i == 1 && i2 == -1 && data != null) {
            y1 y1Var = J4().u;
            h hVar = (h) ((g1) y1Var.getValue()).getData();
            List list = hVar != null ? hVar.a : x61.r.r;
            do {
                value = y1Var.getValue();
                g1.a aVar = g1.Companion;
                h hVar2 = (h) ((g1) y1Var.getValue()).getData();
                a2 = hVar2 != null ? h.a(hVar2, x61.m.l0(list, d0.n(data)), false, false, null, null, 30) : null;
                aVar.getClass();
            } while (!y1Var.i(value, new h0(a2)));
        }
    }

    public final void c4(View view, Bundle bundle) {
        k71.k.g(view, "view");
        B4().U.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(50)});
        TextInputEditText textInputEditText = B4().U;
        k71.k.f(textInputEditText, "titleText");
        textInputEditText.addTextChangedListener(new i(this));
        B4().O.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(60000)});
        TextInputEditText textInputEditText2 = B4().O;
        k71.k.f(textInputEditText2, "bodyText");
        textInputEditText2.addTextChangedListener(new j(this));
        B4().N.setText(D3(2131954738, new Object[]{J4().B}));
        B4().T.setAdapter(this.G0);
        w0.a(J4().v, F3(), androidx.lifecycle.w.u, new k(this, null));
        s J4 = J4();
        J4.x = "";
        y1 y1Var = J4.w;
        y1Var.getClass();
        y1Var.k((Object) null, "");
        J4.z = "";
        y1 y1Var2 = J4.y;
        y1Var2.getClass();
        y1Var2.k((Object) null, "");
        y1 y1Var3 = J4.u;
        g1.a aVar = g1.Companion;
        h.Companion.getClass();
        h hVar = h.f;
        aVar.getClass();
        h0 h0Var = new h0(hVar);
        y1Var3.getClass();
        y1Var3.k((Object) null, h0Var);
    }

    @Override // com.github.rudroid.support.a.InterfaceC0007a
    public final void e2() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        r4(intent, 1);
    }

    @Override // com.github.rudroid.support.d.a
    public final void h0(Uri uri) {
        Object value;
        h a2;
        k71.k.g(uri, "uri");
        y1 y1Var = J4().u;
        h hVar = (h) ((g1) y1Var.getValue()).getData();
        List list = hVar != null ? hVar.a : x61.r.r;
        do {
            value = y1Var.getValue();
            g1.a aVar = g1.Companion;
            h hVar2 = (h) ((g1) y1Var.getValue()).getData();
            a2 = hVar2 != null ? h.a(hVar2, x61.m.k0(list, x61.m.K0(d0.n(uri))), false, false, null, null, 30) : null;
            aVar.getClass();
        } while (!y1Var.i(value, new h0(a2)));
    }

}
