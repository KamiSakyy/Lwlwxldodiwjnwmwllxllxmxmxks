package lg;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import q4.l;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public static final /* synthetic */ b[] A;
    public static final a Companion;
    public static final b r;
    public static final b s;
    public static final b t;
    public static final b u;
    public static final b v;
    public static final b w;
    public static final b x;
    public static final b y;
    public static final b z;

    public static final class a {
        public static int a(Context context, b bVar) {
            k.g(context, "context");
            k.g(bVar, "labelColor");
            Resources resources = context.getResources();
            int a = bVar.a();
            Resources.Theme theme = context.getTheme();
            ThreadLocal threadLocal = l.a;
            return resources.getColor(a, theme);
        }

        public static LayerDrawable b(Context context, b bVar) {
            k.g(bVar, "labelColor");
            Drawable drawable = context.getDrawable(2131231641);
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            k.e(mutate, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            LayerDrawable layerDrawable = (LayerDrawable) mutate;
            Drawable mutate2 = layerDrawable.getDrawable(0).mutate();
            b.Companion.getClass();
            mutate2.setColorFilter(new PorterDuffColorFilter(a(context, bVar), PorterDuff.Mode.SRC_OVER));
            layerDrawable.getDrawable(1).mutate().setColorFilter(new PorterDuffColorFilter(c(context, bVar), PorterDuff.Mode.SRC_ATOP));
            return layerDrawable;
        }

        public static int c(Context context, b bVar) {
            k.g(context, "context");
            k.g(bVar, "labelColor");
            Resources resources = context.getResources();
            int b = bVar.b();
            Resources.Theme theme = context.getTheme();
            ThreadLocal threadLocal = l.a;
            return resources.getColor(b, theme);
        }

        public static int d(Context context, b bVar) {
            k.g(context, "context");
            k.g(bVar, "labelColor");
            Resources resources = context.getResources();
            int c = bVar.c();
            Resources.Theme theme = context.getTheme();
            ThreadLocal threadLocal = l.a;
            return resources.getColor(c, theme);
        }
    }

    /* renamed from: lg.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C0025b {
        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a aVar = b.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a aVar2 = b.Companion;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a aVar3 = b.Companion;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a aVar4 = b.Companion;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a aVar5 = b.Companion;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a aVar6 = b.Companion;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a aVar7 = b.Companion;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a aVar8 = b.Companion;
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        b bVar = new b("BLUE", 0);
        r = bVar;
        b bVar2 = new b("GREEN", 1);
        s = bVar2;
        b bVar3 = new b("ORANGE", 2);
        t = bVar3;
        b bVar4 = new b("PINK", 3);
        u = bVar4;
        b bVar5 = new b("PURPLE", 4);
        v = bVar5;
        b bVar6 = new b("RED", 5);
        w = bVar6;
        b bVar7 = new b("YELLOW", 6);
        x = bVar7;
        b bVar8 = new b("GRAY", 7);
        y = bVar8;
        b bVar9 = new b("SYSTEM", 8);
        z = bVar9;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9};
        A = bVarArr;
        l0.t(bVarArr);
        Companion = new a();
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) A.clone();
    }

    public final int a() {
        switch (ordinal()) {
            case 0:
                return 2131099708;
            case 1:
                return 2131099714;
            case 2:
                return 2131099717;
            case 3:
                return 2131099720;
            case 4:
                return 2131099723;
            case 5:
                return 2131099726;
            case 6:
                return 2131099729;
            case 7:
                return 2131099711;
            case 8:
                return 2131100815;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int b() {
        switch (ordinal()) {
            case 0:
                return 2131099710;
            case 1:
                return 2131099716;
            case 2:
                return 2131099719;
            case 3:
                return 2131099722;
            case 4:
                return 2131099725;
            case 5:
                return 2131099728;
            case 6:
                return 2131099731;
            case 7:
                return 2131099713;
            case 8:
                return 2131099928;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int c() {
        switch (ordinal()) {
            case 0:
                return 2131099709;
            case 1:
                return 2131099715;
            case 2:
                return 2131099718;
            case 3:
                return 2131099721;
            case 4:
                return 2131099724;
            case 5:
                return 2131099727;
            case 6:
                return 2131099730;
            case 7:
            case 8:
                return 2131099712;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
