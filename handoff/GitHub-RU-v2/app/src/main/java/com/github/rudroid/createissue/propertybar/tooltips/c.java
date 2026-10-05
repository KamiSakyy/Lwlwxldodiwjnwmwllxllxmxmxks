package com.github.rudroid.createissue.propertybar.tooltips;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class c {

    public static final /* synthetic */ class a {
        static {
            int[] iArr = new int[com.github.rudroid.createissue.propertybar.tooltips.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                com.github.rudroid.createissue.propertybar.tooltips.a aVar = com.github.rudroid.createissue.propertybar.tooltips.a.f10497r;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final com.github.rudroid.uitoolkit.tooltip.h a(com.github.rudroid.createissue.propertybar.tooltips.a aVar, Context context, final j71.a aVar2, final j71.a aVar3) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            String string = context.getString(2131952367);
            k71.k.f(string, "getString(...)");
            String string2 = context.getString(2131952366);
            k71.k.f(string2, "getString(...)");
            String string3 = context.getString(2131952365);
            k71.k.f(string3, "getString(...)");
            final int i = 0;
            com.github.rudroid.uitoolkit.tooltip.g gVar = new com.github.rudroid.uitoolkit.tooltip.g(string3, new j71.a() { // from class: com.github.rudroid.createissue.propertybar.tooltips.b
                public final Object a() {
                    switch (i) {
                        case k5.f.J /* 0 */:
                            aVar3.a();
                            aVar2.a();
                            break;
                        default:
                            aVar3.a();
                            aVar2.a();
                            break;
                    }
                    return a0.a;
                }
            });
            String string4 = context.getString(2131952364);
            k71.k.f(string4, "getString(...)");
            return new com.github.rudroid.uitoolkit.tooltip.h(string, string2, gVar, new com.github.rudroid.uitoolkit.tooltip.g(string4, aVar3));
        }
        if (ordinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        String string5 = context.getString(2131952369);
        k71.k.f(string5, "getString(...)");
        String string6 = context.getString(2131952368);
        k71.k.f(string6, "getString(...)");
        String string7 = context.getString(2131952365);
        k71.k.f(string7, "getString(...)");
        final int i10 = 1;
        com.github.rudroid.uitoolkit.tooltip.g gVar2 = new com.github.rudroid.uitoolkit.tooltip.g(string7, new j71.a() { // from class: com.github.rudroid.createissue.propertybar.tooltips.b
            public final Object a() {
                switch (i10) {
                    case k5.f.J /* 0 */:
                        aVar3.a();
                        aVar2.a();
                        break;
                    default:
                        aVar3.a();
                        aVar2.a();
                        break;
                }
                return a0.a;
            }
        });
        String string8 = context.getString(2131952364);
        k71.k.f(string8, "getString(...)");
        return new com.github.rudroid.uitoolkit.tooltip.h(string5, string6, gVar2, new com.github.rudroid.uitoolkit.tooltip.g(string8, aVar3));
    }
}
