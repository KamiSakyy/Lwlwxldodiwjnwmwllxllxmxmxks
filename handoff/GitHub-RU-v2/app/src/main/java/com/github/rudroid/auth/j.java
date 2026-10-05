package com.github.rudroid.auth;

import android.content.Context;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import javax.net.ssl.SSLException;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes.dex */
public final class j {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8552a;

        static {
            int[] iArr = new int[ApiFailureType.values().length];
            try {
                iArr[ApiFailureType.SERVER_VERSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiFailureType.NO_NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiFailureType.SSL_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8552a = iArr;
            int[] iArr2 = new int[i.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                i iVar = i.f8541r;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                i iVar2 = i.f8541r;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                i iVar3 = i.f8541r;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                i iVar4 = i.f8541r;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                i iVar5 = i.f8541r;
                iArr2[5] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                i iVar6 = i.f8541r;
                iArr2[6] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                i iVar7 = i.f8541r;
                iArr2[7] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                i iVar8 = i.f8541r;
                iArr2[8] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                i iVar9 = i.f8541r;
                iArr2[9] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                i iVar10 = i.f8541r;
                iArr2[10] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                i iVar11 = i.f8541r;
                iArr2[11] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                i iVar12 = i.f8541r;
                iArr2[12] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                i iVar13 = i.f8541r;
                iArr2[13] = 14;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public static final String a(i iVar, Context context) {
        switch (iVar.ordinal()) {
            case k5.f.J:
                String string = context.getString(2131954657);
                k71.k.f(string, "getString(...)");
                return string;
            case 1:
                String string2 = context.getString(2131954655);
                k71.k.f(string2, "getString(...)");
                return string2;
            case 2:
                String string3 = context.getString(2131954656);
                k71.k.f(string3, "getString(...)");
                return string3;
            case 3:
                String string4 = context.getString(2131954651);
                k71.k.f(string4, "getString(...)");
                return string4;
            case 4:
                String string5 = context.getString(2131954654);
                k71.k.f(string5, "getString(...)");
                return string5;
            case 5:
                String string6 = context.getString(2131954663);
                k71.k.f(string6, "getString(...)");
                return string6;
            case 6:
                String string7 = context.getString(2131954664);
                k71.k.f(string7, "getString(...)");
                return string7;
            case 7:
                String string8 = context.getString(2131954662);
                k71.k.f(string8, "getString(...)");
                return string8;
            case 8:
                String string9 = context.getString(2131954661);
                k71.k.f(string9, "getString(...)");
                return string9;
            case 9:
                String string10 = context.getString(2131954652);
                k71.k.f(string10, "getString(...)");
                return string10;
            case 10:
                String string11 = context.getString(2131954650);
                k71.k.f(string11, "getString(...)");
                return string11;
            case e6.w.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                String string12 = context.getString(2131954660);
                k71.k.f(string12, "getString(...)");
                return string12;
            case e6.w.HAS_IMAGE_ALPHA_FIELD_NUMBER /* 12 */:
                String string13 = context.getString(2131954653);
                k71.k.f(string13, "getString(...)");
                return string13;
            case 13:
                String string14 = context.getString(2131954658);
                k71.k.f(string14, "getString(...)");
                return string14;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String b(k kVar, Context context) {
        String string;
        k71.k.g(kVar, "<this>");
        i iVar = kVar.f8553a;
        k71.k.g(context, "context");
        ApiFailure apiFailure = kVar.f8554b;
        ApiFailureType apiFailureType = apiFailure != null ? apiFailure.r : null;
        int i = apiFailureType == null ? -1 : a.f8552a[apiFailureType.ordinal()];
        if (i == 1) {
            String str = (String) apiFailure.w.get("failure_data_key_server_version");
            return (str == null || (string = context.getString(2131954670, str)) == null) ? a(iVar, context) : string;
        }
        if (i == 2) {
            String string2 = context.getString(2131952518);
            k71.k.f(string2, "getString(...)");
            return string2;
        }
        if (i == 3) {
            String string3 = context.getString(2131954659);
            k71.k.f(string3, "getString(...)");
            return string3;
        }
        if (!(kVar.f8555c instanceof SSLException)) {
            return a(iVar, context);
        }
        String string4 = context.getString(2131954659);
        k71.k.d(string4);
        return string4;
    }
}
