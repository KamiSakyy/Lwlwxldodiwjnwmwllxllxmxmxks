package fg;

import android.content.Context;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import xn.d1;
import xn.e1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {

    public static final /* synthetic */ class a {
        static {
            int[] iArr = new int[e1.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d1 d1Var = e1.Companion;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d1 d1Var2 = e1.Companion;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d1 d1Var3 = e1.Companion;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d1 d1Var4 = e1.Companion;
                iArr[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d1 d1Var5 = e1.Companion;
                iArr[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                d1 d1Var6 = e1.Companion;
                iArr[0] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                d1 d1Var7 = e1.Companion;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static final String a(e1 e1Var, Context context) {
        k.g(e1Var, "<this>");
        k.g(context, "context");
        switch (e1Var.ordinal()) {
            case 0:
            case 7:
                return "";
            case 1:
                String string = context.getString(2131952122);
                k.f(string, "getString(...)");
                return string;
            case 2:
                String string2 = context.getString(2131952123);
                k.f(string2, "getString(...)");
                return string2;
            case 3:
                String string3 = context.getString(2131952125);
                k.f(string3, "getString(...)");
                return string3;
            case 4:
                String string4 = context.getString(2131952124);
                k.f(string4, "getString(...)");
                return string4;
            case 5:
                String string5 = context.getString(2131952120);
                k.f(string5, "getString(...)");
                return string5;
            case 6:
                String string6 = context.getString(2131952121);
                k.f(string6, "getString(...)");
                return string6;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
