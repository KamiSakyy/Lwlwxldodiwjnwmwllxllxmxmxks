package com.github.rudroid.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.github.rudroid.utilities.u2;
import kotlin.NoWhenBranchMatchedException;
import lg.bShadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ReactionView extends AppCompatTextView {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int y;
    public int z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a r;
        public static final a s;
        public static final a t;
        public static final a u;
        public static final /* synthetic */ a[] v;

        static {
            a aVar = new a("Disabled", 0);
            r = aVar;
            a aVar2 = new a("DisabledSelected", 1);
            s = aVar2;
            a aVar3 = new a("Selected", 2);
            t = aVar3;
            a aVar4 = new a("Default", 3);
            u = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            v = aVarArr;
            l0.t(aVarArr);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) v.clone();
        }
    }

    public static final /* synthetic */ class b {
        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a aVar = a.r;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a aVar2 = a.r;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a aVar3 = a.r;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        k71.k.g(context, "context");
        Resources resources = context.getResources();
        k71.k.f(resources, "getResources(...)");
        boolean a2 = rc.c.a(resources);
        bShadow.a aVar = lg.bShadow.Companion;
        lg.bShadow bVar = lg.bShadow.r;
        aVar.getClass();
        this.y = bShadow.a.a(context, bVar);
        this.z = bShadow.a.c(context, bVar);
        this.A = bShadow.a.d(context, bVar);
        lg.bShadow bVar2 = lg.bShadow.y;
        this.B = bShadow.a.a(context, bVar2);
        this.C = bShadow.a.c(context, bVar2);
        this.D = bShadow.a.d(context, bVar2);
        this.E = a2 ? 81 : 40;
        Resources resources2 = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = q4.l.a;
        this.F = resources2.getColor(2131099741, theme);
        this.G = context.getResources().getColor(2131099919, context.getTheme());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setState(a aVar) {
        k71.k.g(aVar, "state");
        Drawable drawable = getContext().getDrawable(2131231622);
        Drawable mutate = drawable != null ? drawable.mutate() : null;
        k71.k.e(mutate, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) mutate;
        int ordinal = aVar.ordinal();
        int i = this.E;
        if (ordinal == 0) {
            Drawable mutate2 = layerDrawable.getDrawable(0).mutate();
            int i2 = this.G;
            mutate2.setTint(i2);
            layerDrawable.getDrawable(1).mutate().setTint(i2);
            layerDrawable.mutate().setAlpha(i);
            setBackground(layerDrawable);
            setTextColor(i2);
            u2.a(this, i2);
            return;
        }
        if (ordinal == 1) {
            Drawable mutate3 = layerDrawable.getDrawable(0).mutate();
            int i3 = this.F;
            mutate3.setTint(i3);
            layerDrawable.getDrawable(1).mutate().setTint(i3);
            layerDrawable.mutate().setAlpha(i);
            setBackground(layerDrawable);
            setTextColor(i3);
            u2.a(this, i3);
            return;
        }
        if (ordinal == 2) {
            layerDrawable.getDrawable(0).mutate().setTint(this.y);
            layerDrawable.getDrawable(1).mutate().setTint(this.z);
            setBackground(layerDrawable);
            int i4 = this.A;
            setTextColor(i4);
            u2.a(this, i4);
            return;
        }
        if (ordinal != 3) {
            throw new NoWhenBranchMatchedException();
        }
        layerDrawable.getDrawable(0).mutate().setTint(this.B);
        layerDrawable.getDrawable(1).mutate().setTint(this.C);
        setBackground(layerDrawable);
        int i5 = this.D;
        setTextColor(i5);
        u2.a(this, i5);
    }

    public static Object getContext(Object... a) {
        return null;
    }

    public static Object setBackground(Object... a) {
        return null;
    }

    public static Object setTextColor(Object... a) {
        return null;
    }
}
