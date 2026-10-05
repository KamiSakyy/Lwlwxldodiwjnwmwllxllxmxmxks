package com.github.rudroid.settings.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.compose.foundation.lazy.layout.s0;
import androidx.preference.SwitchPreference;
import androidx.preference.TwoStatePreference;
import com.google.android.material.switchmaterial.SwitchMaterial;
import e7.v;
import k71.k;
import k71.m;
import k71.x;

/* loaded from: /home/user/work/p/classes3.dex */
public final class BadgeSwitchPreference extends SwitchPreference {
    public static final /* synthetic */ r71.e[] p0;
    public final a n0;
    public final b o0;

    public final class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            k.g(compoundButton, "buttonView");
            Boolean valueOf = Boolean.valueOf(z);
            BadgeSwitchPreference badgeSwitchPreference = BadgeSwitchPreference.this;
            badgeSwitchPreference.c(valueOf);
            badgeSwitchPreference.H(z);
        }
    }

    public static final class b extends s0 {
        public final /* synthetic */ BadgeSwitchPreference t;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(BadgeSwitchPreference badgeSwitchPreference) {
            super(7, r0);
            Boolean bool = Boolean.FALSE;
            this.t = badgeSwitchPreference;
        }

        public final void i(r71.e eVar, Object obj, Object obj2) {
            k.g(eVar, "property");
            ((Boolean) obj2).getClass();
            ((Boolean) obj).getClass();
            r71.e[] eVarArr = BadgeSwitchPreference.p0;
            this.t.j();
        }
    }

    static {
        r71.e mVar = new m(BadgeSwitchPreference.class, "showBadge", "getShowBadge()Z", 0);
        x.a.getClass();
        p0 = new r71.e[]{mVar};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BadgeSwitchPreference(Context context) {
        this(context, null);
        k.g(context, "context");
    }

    public final void n(v vVar) {
        super.n(vVar);
        View y = vVar.y(2131361934);
        TextView textView = y instanceof TextView ? (TextView) y : null;
        if (textView != null) {
            textView.setVisibility(((Boolean) this.o0.t(this, p0[0])).booleanValue() ? 0 : 8);
        }
        SwitchMaterial y2 = vVar.y(2131363382);
        SwitchMaterial switchMaterial = y2 instanceof SwitchMaterial ? y2 : null;
        if (switchMaterial != null) {
            switchMaterial.setOnCheckedChangeListener(null);
            switchMaterial.setChecked(((TwoStatePreference) this).f0);
            switchMaterial.setOnCheckedChangeListener(this.n0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BadgeSwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969661);
        k.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeSwitchPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        k.g(context, "context");
        this.n0 = new a();
        this.o0 = new b(this);
    }
}
