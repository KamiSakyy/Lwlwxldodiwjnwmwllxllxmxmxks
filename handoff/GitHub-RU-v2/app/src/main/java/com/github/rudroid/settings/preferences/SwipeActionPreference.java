package com.github.rudroid.settings.preferences;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.preference.Preference;
import e7.v;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class SwipeActionPreference extends Preference {
    public Integer f0;
    public Integer g0;
    public boolean h0;
    public View i0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwipeActionPreference(Context context) {
        this(context, null);
        k.g(context, "context");
    }

    public final void H(int i, int i2) {
        Integer num = this.f0;
        if (num == null || num.intValue() != i) {
            this.f0 = Integer.valueOf(i);
        }
        Integer num2 = this.g0;
        if (num2 == null || num2.intValue() != i2) {
            this.g0 = Integer.valueOf(i2);
        }
        j();
    }

    public final void n(v vVar) {
        super.n(vVar);
        View view = this.i0;
        Context context = ((Preference) this).r;
        if (view == null) {
            LayoutInflater from = LayoutInflater.from(context);
            View y = vVar.y(2131363177);
            k.e(y, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) y;
            this.i0 = this.h0 ? from.inflate(2131559120, viewGroup) : from.inflate(2131559466, viewGroup);
        }
        View view2 = this.i0;
        ImageView imageView = view2 != null ? (ImageView) view2.findViewById(2131362906) : null;
        ImageView imageView2 = imageView != null ? imageView : null;
        if (imageView2 != null) {
            Integer num = this.f0;
            if (num != null) {
                imageView2.setImageResource(num.intValue());
            }
            Integer num2 = this.g0;
            if (num2 != null) {
                imageView2.setBackgroundColor(imageView2.getContext().getColor(num2.intValue()));
            }
        }
        View y2 = vVar.y(R.id.title);
        if (y2 != null) {
            y2.setContentDescription(context.getString(2131954125, ((Preference) this).y));
        }
        View y3 = vVar.y(R.id.summary);
        if (y3 != null) {
            y3.setContentDescription(context.getString(2131954124, h()));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwipeActionPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969661);
        k.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeActionPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        k.g(context, "context");
        this.h0 = true;
    }

    public <T0> T0 j(Object... a) {
        return null;
    }

    public <T0> T0 B(Object... a) {
        return null;
    }

    public <T0> T0 h(Object... a) {
        return null;
    }
}
