package com.github.rudroid.copilot;

import com.github.service.models.response.Avatar;
import java.time.ZonedDateTime;
import java.util.List;
import le.i;

/* loaded from: /home/user/work/p/classes.dex */
public abstract /* synthetic */ class h1 {
    public static void A(String str, String str2, String str3, StringBuilder sb2, ZonedDateTime zonedDateTime) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(zonedDateTime);
        sb2.append(str3);
    }

    public static void B(StringBuilder sb2, ZonedDateTime zonedDateTime, String str, ZonedDateTime zonedDateTime2, String str2) {
        sb2.append(zonedDateTime);
        sb2.append(str);
        sb2.append(zonedDateTime2);
        sb2.append(str2);
    }

    public static void C(StringBuilder sb2, List list, String str, boolean z10, String str2) {
        sb2.append(list);
        sb2.append(str);
        sb2.append(z10);
        sb2.append(str2);
    }

    public static int D(int i, int i10, int i11) {
        return com.google.android.gms.internal.play_billing.m1.z0(i) + i10 + i11;
    }

    public static int E(int i, int i10, int i11, int i12) {
        return com.google.android.gms.internal.play_billing.m1.z0(i) + i10 + i11 + i12;
    }

    public static /* synthetic */ String F(int i) {
        switch (i) {
            case 1:
                return "CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN";
            case 2:
                return "CLIENT_UPLOAD_ELIGIBLE";
            case 3:
                return "MEASUREMENT_SERVICE_NOT_ENABLED";
            case 4:
                return "ANDROID_TOO_OLD";
            case 5:
                return "NON_PLAY_MODE";
            case 6:
                return "SDK_TOO_OLD";
            case 7:
                return "MISSING_JOB_SCHEDULER";
            case 8:
                return "NOT_ENABLED_IN_MANIFEST";
            case 9:
                return "CLIENT_FLAG_OFF";
            case 10:
                return "SERVICE_FLAG_OFF";
            case e6.w.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return "PINNED_TO_SERVICE_UPLOAD";
            case e6.w.HAS_IMAGE_ALPHA_FIELD_NUMBER /* 12 */:
                return "MISSING_SGTM_SERVER_URL";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String G(int i) {
        switch (i) {
            case 1:
                return "Doctype";
            case 2:
                return "StartTag";
            case 3:
                return "EndTag";
            case 4:
                return "Comment";
            case 5:
                return "Character";
            case 6:
                return "XmlDecl";
            case 7:
                return "EOF";
            default:
                return "null";
        }
    }

    public static int a(int i) {
        switch (i) {
            case k5.f.J:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                switch (i) {
                    case 20:
                        return 10;
                    case 21:
                        return 11;
                    case 22:
                        return 12;
                    default:
                        return 0;
                }
        }
    }

    public static int b(int i) {
        if (i == 90) {
            return 81;
        }
        if (i == 91) {
            return 82;
        }
        if (i == 93) {
            return 84;
        }
        if (i == 94) {
            return 85;
        }
        switch (i) {
            case k5.f.J:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case e6.w.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return 12;
            case e6.w.HAS_IMAGE_ALPHA_FIELD_NUMBER /* 12 */:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case androidx.compose.foundation.layout.b.f1079h /* 15 */:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            default:
                switch (i) {
                    case 96:
                        return 87;
                    case 97:
                        return 88;
                    case 98:
                        return 89;
                    case 99:
                        return 90;
                    case 100:
                        return 91;
                    case 101:
                        return 92;
                    case 102:
                        return 83;
                    case 103:
                        return 86;
                    case 104:
                        return 93;
                    case 105:
                        return 94;
                    case 106:
                        return 95;
                    case 107:
                        return 96;
                    case 108:
                        return 97;
                    case 109:
                        return 98;
                    case 110:
                        return 99;
                    case 111:
                        return 100;
                    case 112:
                        return 101;
                    case 113:
                        return 102;
                    case 114:
                        return 103;
                    case 115:
                        return 104;
                    case 116:
                        return 105;
                    case 117:
                        return 106;
                    case 118:
                        return 107;
                    case 119:
                        return 108;
                    case 120:
                        return 109;
                    case 121:
                        return 110;
                    case 122:
                        return 111;
                    case 123:
                        return 112;
                    case 124:
                        return 113;
                    case 125:
                        return 114;
                    case 126:
                        return 117;
                    case 127:
                        return 119;
                    case 128:
                        return 120;
                    case 129:
                        return 121;
                    case 130:
                        return 122;
                    case 131:
                        return 123;
                    case 132:
                        return 124;
                    case 133:
                        return 125;
                    case 134:
                        return 126;
                    case 135:
                        return 127;
                    case 136:
                        return 128;
                    case 137:
                        return 129;
                    case 138:
                        return 130;
                    case 139:
                        return 131;
                    case 140:
                        return 132;
                    case 141:
                        return 133;
                    case 142:
                        return 134;
                    case 143:
                        return 135;
                    case 144:
                        return 136;
                    case 145:
                        return 115;
                    case 146:
                        return 116;
                    case 147:
                        return 118;
                    case 148:
                        return 137;
                    case 149:
                        return 138;
                    case 150:
                        return 139;
                    case 151:
                        return 140;
                    case 152:
                        return 141;
                    default:
                        return 0;
                }
        }
    }

    public static /* synthetic */ int c(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case e6.w.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return 10;
            case e6.w.HAS_IMAGE_ALPHA_FIELD_NUMBER /* 12 */:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case androidx.compose.foundation.layout.b.f1079h /* 15 */:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return 17;
            case 19:
                return 18;
            case 20:
                return 19;
            case 21:
                return 20;
            case 22:
                return 21;
            case 23:
                return 22;
            case 24:
                return 23;
            case 25:
                return 24;
            case 26:
                return 25;
            case 27:
                return 26;
            case 28:
                return 27;
            case 29:
                return 28;
            case 30:
                return 29;
            case 31:
                return 30;
            case 32:
                return 31;
            case 33:
                return 32;
            case 34:
                return 33;
            case 35:
                return 34;
            case 36:
                return 35;
            case 37:
                return 36;
            case 38:
                return 37;
            case 39:
                return 38;
            case 40:
                return 39;
            case 41:
                return 40;
            case 42:
                return 41;
            case 43:
                return 42;
            case 44:
                return 43;
            case 45:
                return 44;
            case 46:
                return 45;
            case 47:
                return 46;
            case 48:
                return 47;
            case 49:
                return 48;
            case 50:
                return 49;
            case 51:
                return 50;
            case 52:
                return 51;
            case 53:
                return 52;
            case 54:
                return 53;
            case 55:
                return 54;
            case 56:
                return 55;
            case 57:
                return 56;
            case 58:
                return 57;
            case 59:
                return 58;
            case 60:
                return 59;
            case 61:
                return 60;
            case 62:
                return 61;
            case 63:
                return 62;
            case 64:
                return 63;
            case 65:
                return 64;
            case 66:
                return 65;
            case 67:
                return 66;
            case 68:
                return 67;
            case 69:
                return 68;
            case 70:
                return 69;
            case 71:
                return 70;
            case 72:
                return 71;
            case 73:
                return 72;
            case 74:
                return 73;
            case 75:
                return 74;
            case 76:
                return 75;
            case 77:
                return 76;
            case 78:
                return 77;
            case 79:
                return 78;
            case 80:
                return 79;
            case 81:
                return 90;
            case 82:
                return 91;
            case 83:
                return 102;
            case 84:
                return 93;
            case 85:
                return 94;
            case 86:
                return 103;
            case 87:
                return 96;
            case 88:
                return 97;
            case 89:
                return 98;
            case 90:
                return 99;
            case 91:
                return 100;
            case 92:
                return 101;
            case 93:
                return 104;
            case 94:
                return 105;
            case 95:
                return 106;
            case 96:
                return 107;
            case 97:
                return 108;
            case 98:
                return 109;
            case 99:
                return 110;
            case 100:
                return 111;
            case 101:
                return 112;
            case 102:
                return 113;
            case 103:
                return 114;
            case 104:
                return 115;
            case 105:
                return 116;
            case 106:
                return 117;
            case 107:
                return 118;
            case 108:
                return 119;
            case 109:
                return 120;
            case 110:
                return 121;
            case 111:
                return 122;
            case 112:
                return 123;
            case 113:
                return 124;
            case 114:
                return 125;
            case 115:
                return 145;
            case 116:
                return 146;
            case 117:
                return 126;
            case 118:
                return 147;
            case 119:
                return 127;
            case 120:
                return 128;
            case 121:
                return 129;
            case 122:
                return 130;
            case 123:
                return 131;
            case 124:
                return 132;
            case 125:
                return 133;
            case 126:
                return 134;
            case 127:
                return 135;
            case 128:
                return 136;
            case 129:
                return 137;
            case 130:
                return 138;
            case 131:
                return 139;
            case 132:
                return 140;
            case 133:
                return 141;
            case 134:
                return 142;
            case 135:
                return 143;
            case 136:
                return 144;
            case 137:
                return 148;
            case 138:
                return 149;
            case 139:
                return 150;
            case 140:
                return 151;
            case 141:
                return 152;
            default:
                throw null;
        }
    }

    public static /* synthetic */ int d(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 20;
            case e6.w.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return 21;
            case e6.w.HAS_IMAGE_ALPHA_FIELD_NUMBER /* 12 */:
                return 22;
            default:
                throw null;
        }
    }

    public static int e(int i, int i10, int i11) {
        return com.google.android.gms.internal.measurement.y4.s0(i) + i10 + i11;
    }

    public static int f(int i, int i10, int i11, int i12) {
        return com.google.android.gms.internal.measurement.y4.s0(i) + i10 + i11 + i12;
    }

    public static int g(int i, int i10, int i11, int i12, int i13) {
        return Math.max(((i * i10) / i11) + i12, i13);
    }

    public static int h(int i, Object obj, int i10) {
        return (obj.hashCode() + i) * i10;
    }

    public static int i(int i, String str, int i10) {
        return (str.hashCode() + i) * i10;
    }

    public static int j(Avatar avatar, int i, int i10) {
        return (avatar.hashCode() + i) * i10;
    }

    public static j0.j k(androidx.compose.runtime.s sVar) {
        j0.j jVar = new j0.j();
        sVar.n0(jVar);
        return jVar;
    }

    public static String l(Object obj, String str, String str2) {
        return str + obj + str2;
    }

    public static String m(String str, long j10) {
        return str + j10;
    }

    public static String n(String str, String str2, String str3, String str4, boolean z10) {
        return str + str2 + str3 + z10 + str4;
    }

    public static String o(String str, String str2, String str3, ZonedDateTime zonedDateTime) {
        return str + str2 + str3 + zonedDateTime;
    }

    public static String p(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String q(StringBuilder sb2, ZonedDateTime zonedDateTime, String str) {
        sb2.append(zonedDateTime);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder r(Integer num, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(num);
        sb2.append(str4);
        return sb2;
    }

    public static StringBuilder s(String str, String str2, String str3, String str4, ZonedDateTime zonedDateTime) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(zonedDateTime);
        sb2.append(str4);
        return sb2;
    }

    public static StringBuilder t(String str, String str2, String str3, String str4, boolean z10) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(z10);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2;
    }

    public static StringBuilder u(String str, boolean z10, String str2, boolean z11, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(z10);
        sb2.append(str2);
        sb2.append(z11);
        sb2.append(str3);
        return sb2;
    }

    public static List v(String str) {
        return sy.d0.n(new i.j0.b.C0082b(str));
    }

    public static k71.m w(k71.y yVar, Class cls, String str, String str2, int i) {
        yVar.getClass();
        return new k71.m(cls, str, str2, i);
    }

    public static void x(float f6, StringBuilder sb2, String str) {
        sb2.append((Object) s3.f.c(f6));
        sb2.append(str);
    }

    public static void y(long j10, String str, StringBuilder sb2) {
        sb2.append((Object) d2.t.i(j10));
        sb2.append(str);
    }

    public static void z(a5.s sVar, long j10) {
        sVar.t().q();
        sVar.F(j10);
    }
}
