package com.google.android.material.datepicker;

import android.R;
import android.content.res.TypedArray;
import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;
import q.d3;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements View.OnClickListener {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ k(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [android.app.Dialog, d31.j] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        switch (this.r) {
            case 0:
                MaterialCalendar materialCalendar = (MaterialCalendar) this.s;
                int i = materialCalendar.x0;
                if (i != 2) {
                    if (i == 1) {
                        materialCalendar.t4(2);
                        materialCalendar.z0.announceForAccessibility(materialCalendar.C3(2131953303));
                        break;
                    }
                } else {
                    materialCalendar.t4(1);
                    materialCalendar.A0.announceForAccessibility(materialCalendar.C3(2131953302));
                    break;
                }
                break;
            case 1:
                ?? r4 = (d31.j) this.s;
                if (r4.B && r4.isShowing()) {
                    if (!r4.D) {
                        TypedArray obtainStyledAttributes = r4.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        r4.C = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        r4.D = true;
                    }
                    if (r4.C) {
                        r4.cancel();
                        break;
                    }
                }
                break;
            case 2:
                ((Preference) this.s).u(view);
                break;
            case 3:
                k.f fVar = (k.f) this.s;
                Message obtain = (view != fVar.i || (message3 = fVar.k) == null) ? (view != fVar.l || (message2 = fVar.n) == null) ? (view != fVar.o || (message = fVar.q) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
                if (obtain != null) {
                    obtain.sendToTarget();
                }
                fVar.F.obtainMessage(1, fVar.b).sendToTarget();
                break;
            case 4:
                ((o.b) this.s).a();
                break;
            case 5:
                d3 d3Var = ((Toolbar) this.s).g0;
                p.n nVar = d3Var == null ? null : d3Var.s;
                if (nVar != null) {
                    nVar.collapseActionView();
                    break;
                }
                break;
            default:
                ((r61.a) this.s).h.getClass();
                break;
        }
    }
}
