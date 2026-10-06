package com.github.rudroid.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import ic.wh;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import lg.bShadow;
import x61.x;
import yz0.r3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u extends LinearLayout {
    public static final a Companion = new a();
    public bShadow r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;

    public static final class a {
        public static k.g a(Context context, yz0.bShadow bVar, bShadow bVar2, List list) {
            k71.k.g(context, "context");
            k71.k.g(bVar, "data");
            k71.k.g(list, "selection");
            u uVar = new u(context);
            uVar.a(bVar, list);
            uVar.r = bVar2;
            b21.v vVar = new b21.v(context, 2132017621);
            ((k.d) vVar.t).q = uVar;
            k.g A = vVar.A();
            Window window = A.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            Window window2 = A.getWindow();
            if (window2 != null) {
                window2.setLayout(uVar.t, -2);
            }
            return A;
        }
    }

    public interface b {
        void a(r3 r3Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context) {
        super(context, null, 0, 0);
        k71.k.g(context, "context");
        Resources resources = context.getResources();
        k71.k.f(resources, "getResources(...)");
        int a2 = wh.a(resources);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165315);
        this.s = context.getResources().getDimensionPixelSize(2131165322);
        int i = a2 - (dimensionPixelSize * 2);
        this.t = i;
        bShadow.a aVar = lg.bShadow.Companion;
        lg.bShadow bVar = lg.bShadow.r;
        aVar.getClass();
        this.u = bShadow.a.a(context, bVar);
        this.v = bShadow.a.c(context, bVar);
        int color = context.getColor(2131099701);
        this.w = color;
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(i, -2));
        Drawable drawable = context.getDrawable(2131231622);
        Drawable mutate = drawable != null ? drawable.mutate() : null;
        k71.k.e(mutate, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) mutate;
        layerDrawable.getDrawable(0).mutate().setTint(color);
        layerDrawable.getDrawable(1).mutate().setTint(0);
        setBackground(layerDrawable);
    }

    private final LinearLayout getRowContainer() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        return linearLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(yz0.bShadow bVar, List list) {
        LayerDrawable layerDrawable;
        k71.k.g(bVar, "data");
        k71.k.g(list, "selection");
        ArrayList arrayList = bVar.a;
        int size = arrayList.size() / 2;
        int i = this.s;
        int i2 = (this.t - ((size + 1) * i)) / size;
        int i3 = (i2 * 3) / 4;
        removeAllViews();
        LinearLayout rowContainer = getRowContainer();
        int i4 = 0;
        rowContainer.setPadding(0, i, 0, i);
        int s = x.s(x61.n.F(list, 10));
        if (s < 16) {
            s = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s);
        for (Object obj : list) {
            linkedHashMap.put(Long.valueOf(((r3) obj).e), obj);
        }
        int size2 = arrayList.size();
        int i5 = 0;
        int i6 = 0;
        while (i6 < size2) {
            Object obj2 = arrayList.get(i6);
            i6++;
            r3 r3Var = (r3) obj2;
            Object obj3 = linkedHashMap.get(Long.valueOf(r3Var.e));
            if (obj3 != 0) {
                r3Var = obj3;
            }
            r3 r3Var2 = r3Var;
            if (i5 == size) {
                addView(rowContainer);
                rowContainer = getRowContainer();
                rowContainer.setPadding(i4, i4, i4, i);
                i5 = i4;
            }
            boolean z = r3Var2.d;
            if (z) {
                Drawable drawable = getContext().getDrawable(2131231622);
                Drawable mutate = drawable != null ? drawable.mutate() : null;
                k71.k.e(mutate, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
                layerDrawable = (LayerDrawable) mutate;
                layerDrawable.getDrawable(0).mutate().setTint(this.u);
                layerDrawable.getDrawable(1).mutate().setTint(this.v);
            } else {
                Drawable drawable2 = getContext().getDrawable(2131231622);
                Drawable mutate2 = drawable2 != null ? drawable2.mutate() : null;
                k71.k.e(mutate2, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
                layerDrawable = (LayerDrawable) mutate2;
                layerDrawable.getDrawable(0).mutate().setTint(this.w);
                layerDrawable.getDrawable(1).mutate().setTint(0);
            }
            TextView textView = new TextView(getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i2, i3);
            if (i5 == 0) {
                marginLayoutParams.leftMargin = i;
            }
            marginLayoutParams.rightMargin = i;
            textView.setLayoutParams(marginLayoutParams);
            textView.setGravity(17);
            textView.setBackground(layerDrawable);
            textView.setTextSize(0, i3 / 2);
            textView.setText(r3Var2.a.b);
            textView.setOnClickListener(new cd.n(15, this, r3Var2));
            textView.setSelected(z);
            rowContainer.addView(textView);
            i5++;
            i4 = 0;
        }
        addView(rowContainer);
    }
}
