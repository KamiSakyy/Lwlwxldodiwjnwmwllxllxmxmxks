package com.github.rudroid.settings.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.compose.foundation.lazy.layout.s0;
import androidx.preference.Preference;
import com.github.rudroid.copilot.h1;
import e7.v;
import java.util.Iterator;
import java.util.List;
import k71.k;
import k71.m;
import k71.x;
import l7.n1;
import pc.a0;
import pc.u;
import pc.z;
import x61.r;
import yz0.b8;
import yz0.q2;
import yz0.v7;

/* loaded from: /home/user/work/p/classes3.dex */
public final class RadioPreferenceGroup extends Preference {
    public static final /* synthetic */ r71.e[] i0 = {new m(RadioPreferenceGroup.class, "radioTitles", "getRadioTitles()Ljava/util/List;", 0), h1.w(x.a, RadioPreferenceGroup.class, "checkedId", "getCheckedId()I", 0), new m(RadioPreferenceGroup.class, "onValueChangedListener", "getOnValueChangedListener()Lcom/github/rudroid/settings/preferences/RadioPreferenceGroup$OnValueChangedListener;", 0)};
    public final b f0;
    public final c g0;
    public final d h0;

    public interface a {
        void a(int i);
    }

    public static final class b extends s0 {
        public b() {
            super(7, r.r);
        }

        public final void i(r71.e eVar, Object obj, Object obj2) {
            k.g(eVar, "property");
            r71.e[] eVarArr = RadioPreferenceGroup.i0;
            RadioPreferenceGroup.this.j();
        }
    }

    public static final class c extends s0 {
        public c() {
            super(7, -1);
        }

        public final void i(r71.e eVar, Object obj, Object obj2) {
            k.g(eVar, "property");
            ((Number) obj2).intValue();
            ((Number) obj).intValue();
            r71.e[] eVarArr = RadioPreferenceGroup.i0;
            RadioPreferenceGroup.this.j();
        }
    }

    public static final class d extends s0 {
        public final /* synthetic */ RadioPreferenceGroup t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f fVar, RadioPreferenceGroup radioPreferenceGroup) {
            super(7, fVar);
            this.t = radioPreferenceGroup;
        }

        public final void i(r71.e eVar, Object obj, Object obj2) {
            k.g(eVar, "property");
            r71.e[] eVarArr = RadioPreferenceGroup.i0;
            this.t.j();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadioPreferenceGroup(Context context) {
        this(context, null);
        k.g(context, "context");
    }

    public final void n(v vVar) {
        super.n(vVar);
        LayoutInflater from = LayoutInflater.from(((Preference) this).r);
        View view = ((n1) vVar).a;
        final LinearLayout linearLayout = view instanceof LinearLayout ? (LinearLayout) view : null;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            b bVar = this.f0;
            r71.e[] eVarArr = i0;
            Iterator it = ((List) bVar.t(this, eVarArr[0])).iterator();
            while (it.hasNext()) {
                final int intValue = ((Number) it.next()).intValue();
                View inflate = from.inflate(2131559365, (ViewGroup) linearLayout, false);
                TextView textView = (TextView) inflate.findViewById(2131363438);
                if (textView != null) {
                    textView.setText(linearLayout.getContext().getString(intValue));
                }
                final RadioButton radioButton = (RadioButton) inflate.findViewById(2131363210);
                if (radioButton != null) {
                    radioButton.setId(intValue);
                    radioButton.setChecked(((Number) this.g0.t(this, eVarArr[1])).intValue() == intValue);
                    final int i = 0;
                    radioButton.setOnClickListener(new View.OnClickListener() { // from class: com.github.rudroid.settings.preferences.g
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i2 = i;
                            int i3 = intValue;
                            Object obj = radioButton;
                            Object obj2 = this;
                            switch (i2) {
                                case 0:
                                    r71.e[] eVarArr2 = RadioPreferenceGroup.i0;
                                    ((RadioButton) obj).postDelayed(new b1.c((RadioPreferenceGroup) obj2, i3, 2), 150L);
                                    break;
                                case 1:
                                    r71.e[] eVarArr3 = RadioPreferenceGroup.i0;
                                    ((LinearLayout) obj).postDelayed(new b1.c((RadioPreferenceGroup) obj2, i3, 2), 150L);
                                    break;
                                case 2:
                                    b8 b8Var = (b8) obj2;
                                    u uVar = (u) obj;
                                    int i4 = u.w;
                                    if (b8Var.b) {
                                        k.d(view2);
                                        rc.d.a(view2);
                                        uVar.v.a(b8Var, i3);
                                        break;
                                    }
                                    break;
                                case 3:
                                    int i5 = z.w;
                                    k.d(view2);
                                    rc.d.a(view2);
                                    ((z) obj2).v.a((q2) obj, i3);
                                    break;
                                default:
                                    int i6 = a0.w;
                                    k.d(view2);
                                    rc.d.a(view2);
                                    ((a0) obj2).v.a((v7) obj, i3);
                                    break;
                            }
                        }
                    });
                }
                ViewGroup viewGroup = (ViewGroup) inflate.findViewById(2131363211);
                if (viewGroup != null) {
                    final int i2 = 1;
                    viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.github.rudroid.settings.preferences.g
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i22 = i2;
                            int i3 = intValue;
                            Object obj = linearLayout;
                            Object obj2 = this;
                            switch (i22) {
                                case 0:
                                    r71.e[] eVarArr2 = RadioPreferenceGroup.i0;
                                    ((RadioButton) obj).postDelayed(new b1.c((RadioPreferenceGroup) obj2, i3, 2), 150L);
                                    break;
                                case 1:
                                    r71.e[] eVarArr3 = RadioPreferenceGroup.i0;
                                    ((LinearLayout) obj).postDelayed(new b1.c((RadioPreferenceGroup) obj2, i3, 2), 150L);
                                    break;
                                case 2:
                                    b8 b8Var = (b8) obj2;
                                    u uVar = (u) obj;
                                    int i4 = u.w;
                                    if (b8Var.b) {
                                        k.d(view2);
                                        rc.d.a(view2);
                                        uVar.v.a(b8Var, i3);
                                        break;
                                    }
                                    break;
                                case 3:
                                    int i5 = z.w;
                                    k.d(view2);
                                    rc.d.a(view2);
                                    ((z) obj2).v.a((q2) obj, i3);
                                    break;
                                default:
                                    int i6 = a0.w;
                                    k.d(view2);
                                    rc.d.a(view2);
                                    ((a0) obj2).v.a((v7) obj, i3);
                                    break;
                            }
                        }
                    });
                }
                linearLayout.addView(inflate);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadioPreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969661);
        k.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioPreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        k.g(context, "context");
        this.f0 = new b();
        this.g0 = new c();
        this.h0 = new d(new f(), this);
    }


    public <T0> T0 j(Object... a) {
        return null;
    }
}
