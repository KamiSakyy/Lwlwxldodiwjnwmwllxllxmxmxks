package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.constraintlayout.core.parser.CLParsingException;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.CheckConclusionState;
import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.Language;
import com.github.service.models.response.projects.ProjectFieldOption$Iteration;
import com.github.service.models.response.projects.ProjectFieldOption$SingleOption;
import com.github.service.models.response.projects.ProjectFieldType;
import com.github.service.models.response.projects.ProjectV2Field$ProjectV2IterationField;
import com.github.service.models.response.projects.ProjectV2Field$ProjectV2SingleSelectField;
import com.github.service.models.response.projects.ProjectV2Field$ProjectV2TextField;
import com.github.service.models.response.projects.ProjectV2Field$ProjectV2UnknownField;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.github.service.models.response.type.IssueState;
import com.github.service.models.response.type.StatusState;
import com.github.service.models.response.type.SubscriptionState;
import com.google.android.gms.internal.play_billing.zzgc;
import hc0.jc;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import jn0.ra0;
import jn0.ta0;
import jn0.ua0;
import jn0.va0;
import jn0.wa0;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m10.da0;
import m10.ya0;
import org.json.JSONObject;
import pz0.bf;
import pz0.s00;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i4 implements Decoder, j81.a {
    public static volatile j41.b a;

    public static void A0(h91.f fVar, byte[] bArr) {
        long j;
        k71.k.g(fVar, "cursor");
        k71.k.g(bArr, "key");
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = fVar.v;
            int i2 = fVar.w;
            int i3 = fVar.x;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = fVar.u;
            h91.h hVar = fVar.r;
            k71.k.d(hVar);
            if (j2 == hVar.s) {
                throw new IllegalStateException("no more bytes");
            }
            j = fVar.u;
        } while (fVar.m(j == -1 ? 0L : j + (fVar.x - fVar.w)) != -1);
    }

    public static final String B0(String str) {
        k71.k.g(str, "<this>");
        StringBuilder sb = new StringBuilder();
        for (byte b : t71.w.w(str)) {
            int i = b & 255;
            if ((97 > i || i >= 123) && ((65 > i || i >= 91) && !((48 <= i && i < 58) || i == 45 || i == 46 || i == 95 || i == 126))) {
                sy.r.m(16);
                String num = Integer.toString(i, 16);
                k71.k.f(num, "toString(...)");
                String upperCase = num.toUpperCase(Locale.ROOT);
                k71.k.f(upperCase, "toUpperCase(...)");
                if (upperCase.length() == 1) {
                    upperCase = "0".concat(upperCase);
                }
                sb.append("%" + upperCase);
            } else {
                sb.append((char) i);
            }
        }
        String sb2 = sb.toString();
        k71.k.f(sb2, "toString(...)");
        return sb2;
    }

    public static int C0(byte[] bArr, int i, androidx.glance.appwidget.protobuf.d dVar) {
        int H0 = H0(bArr, i, dVar);
        int i2 = dVar.a;
        if (i2 < 0) {
            throw new zzgc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - H0) {
            throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            dVar.c = com.google.android.gms.internal.play_billing.k1.s;
            return H0;
        }
        dVar.c = com.google.android.gms.internal.play_billing.k1.k(bArr, H0, i2);
        return H0 + i2;
    }

    public static int D0(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int E0(com.google.android.gms.internal.play_billing.o2 o2Var, int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.play_billing.x1 x1Var, androidx.glance.appwidget.protobuf.d dVar) {
        com.google.android.gms.internal.play_billing.t1 a2 = o2Var.a();
        com.google.android.gms.internal.play_billing.o2 o2Var2 = o2Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        androidx.glance.appwidget.protobuf.d dVar2 = dVar;
        int M0 = M0(a2, o2Var2, bArr2, i2, i4, dVar2);
        o2Var2.c(a2);
        dVar2.c = a2;
        x1Var.add(a2);
        while (M0 < i4) {
            androidx.glance.appwidget.protobuf.d dVar3 = dVar2;
            int i5 = i4;
            int H0 = H0(bArr2, M0, dVar3);
            if (i != dVar3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            com.google.android.gms.internal.play_billing.o2 o2Var3 = o2Var2;
            com.google.android.gms.internal.play_billing.t1 a3 = o2Var3.a();
            M0 = M0(a3, o2Var3, bArr3, H0, i5, dVar3);
            o2Var2 = o2Var3;
            bArr2 = bArr3;
            i4 = i5;
            dVar2 = dVar3;
            o2Var2.c(a3);
            dVar2.c = a3;
            x1Var.add(a3);
        }
        return M0;
    }

    public static final void F(l51.h hVar, com.google.android.gms.measurement.internal.x3 x3Var) {
        for (Map.Entry entry : x3Var.p().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            k71.k.g(str, "name");
            k71.k.g(str2, "value");
            q81.y.Companion.getClass();
            ((ArrayList) hVar.u).add(b31.b.N(str, null, q81.x.a(str2, (q81.q) null)));
        }
    }

    public static int F0(byte[] bArr, int i, com.google.android.gms.internal.play_billing.x1 x1Var, androidx.glance.appwidget.protobuf.d dVar) {
        com.google.android.gms.internal.play_billing.u1 u1Var = (com.google.android.gms.internal.play_billing.u1) x1Var;
        int H0 = H0(bArr, i, dVar);
        int i2 = dVar.a + H0;
        while (H0 < i2) {
            H0 = H0(bArr, H0, dVar);
            u1Var.d(dVar.a);
        }
        if (H0 == i2) {
            return H0;
        }
        throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static final in.b1 G(Throwable th, String str, String str2, String str3) {
        return th instanceof in.b1 ? (in.b1) th : th instanceof IOException ? new in.b1(new in.b0(f1.e.h(str, " ", th.getMessage()), str2, str3), th) : new in.b1(new in.i0(f1.e.h(str, " ", th.getMessage()), str2, str3), th);
    }

    public static int G0(int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.play_billing.q2 q2Var, androidx.glance.appwidget.protobuf.d dVar) {
        if ((i >>> 3) == 0) {
            throw new zzgc("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int K0 = K0(bArr, i2, dVar);
            q2Var.c(i, Long.valueOf(dVar.b));
            return K0;
        }
        if (i4 == 1) {
            q2Var.c(i, Long.valueOf(N0(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int H0 = H0(bArr, i2, dVar);
            int i5 = dVar.a;
            if (i5 < 0) {
                throw new zzgc("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - H0) {
                throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                q2Var.c(i, com.google.android.gms.internal.play_billing.k1.s);
            } else {
                q2Var.c(i, com.google.android.gms.internal.play_billing.k1.k(bArr, H0, i5));
            }
            return H0 + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zzgc("Protocol message contained an invalid tag (zero).");
            }
            q2Var.c(i, Integer.valueOf(D0(i2, bArr)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        com.google.android.gms.internal.play_billing.q2 b = com.google.android.gms.internal.play_billing.q2.b();
        int i7 = dVar.d + 1;
        dVar.d = i7;
        if (i7 >= 100) {
            throw new zzgc("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int H02 = H0(bArr, i2, dVar);
            int i9 = dVar.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = H02;
                break;
            }
            i2 = G0(i9, bArr, H02, i3, b, dVar);
            i8 = i9;
        }
        dVar.d--;
        if (i2 > i3 || i8 != i6) {
            throw new zzgc("Failed to parse the message.");
        }
        q2Var.c(i, b);
        return i2;
    }

    public static final in.t H(ContentResolver contentResolver, Uri uri) {
        Cursor query = contentResolver.query(uri, null, null, null, null);
        if (query == null) {
            throw new FileNotFoundException("cannot open " + uri);
        }
        try {
            int columnIndex = query.getColumnIndex("_display_name");
            int columnIndex2 = query.getColumnIndex("_size");
            query.moveToFirst();
            String string = query.getString(columnIndex);
            if (string == null) {
                string = UUID.randomUUID().toString();
                k71.k.f(string, "toString(...)");
            }
            long j = query.getLong(columnIndex2);
            query.close();
            return new in.t(uri, string, j, contentResolver.getType(uri), contentResolver);
        } finally {
        }
    }

    public static int H0(byte[] bArr, int i, androidx.glance.appwidget.protobuf.d dVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return I0(b, bArr, i2, dVar);
        }
        dVar.a = b;
        return i2;
    }

    public static final String I(JSONObject jSONObject, String str) {
        String string;
        if (jSONObject == null || (string = jSONObject.getString(str)) == null) {
            throw new IllegalStateException("missing property: ".concat(str));
        }
        return string;
    }

    public static int I0(int i, byte[] bArr, int i2, androidx.glance.appwidget.protobuf.d dVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            dVar.a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            dVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            dVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            dVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i12 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i10 + 1;
            if (bArr[i10] >= 0) {
                dVar.a = i12;
                return i13;
            }
            i10 = i13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object J(List list, n5.j jVar, c71.c cVar) {
        n5.e eVar;
        int i;
        List list2;
        k71.w wVar;
        Iterator it;
        Throwable th;
        if (cVar instanceof n5.e) {
            eVar = (n5.e) cVar;
            int i2 = eVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.x = i2 - Integer.MIN_VALUE;
                Object obj = eVar.w;
                b71.a aVar = b71.a.r;
                i = eVar.x;
                if (i != 0) {
                    sy.y.j(obj);
                    ArrayList arrayList = new ArrayList();
                    a0.i iVar = new a0.i(list, arrayList, (a71.c) null);
                    eVar.u = arrayList;
                    eVar.x = 1;
                    if (jVar.a(iVar, eVar) == aVar) {
                        return aVar;
                    }
                    list2 = arrayList;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = eVar.v;
                        wVar = (k71.w) eVar.u;
                        try {
                            sy.y.j(obj);
                        } catch (Throwable th2) {
                            Object obj2 = wVar.r;
                            if (obj2 == null) {
                                wVar.r = th2;
                            } else {
                                sy.u.a((Throwable) obj2, th2);
                            }
                        }
                        while (it.hasNext()) {
                            j71.c cVar2 = (j71.c) it.next();
                            eVar.u = wVar;
                            eVar.v = it;
                            eVar.x = 2;
                            if (cVar2.k(eVar) == aVar) {
                                return aVar;
                            }
                        }
                        th = (Throwable) wVar.r;
                        if (th == null) {
                            return w61.a0.a;
                        }
                        throw th;
                    }
                    list2 = (List) eVar.u;
                    sy.y.j(obj);
                }
                wVar = new k71.w();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) wVar.r;
                if (th == null) {
                }
            }
        }
        eVar = new n5.e(cVar);
        Object obj3 = eVar.w;
        b71.a aVar2 = b71.a.r;
        i = eVar.x;
        if (i != 0) {
        }
        wVar = new k71.w();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) wVar.r;
        if (th == null) {
        }
    }

    public static int J0(int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.play_billing.x1 x1Var, androidx.glance.appwidget.protobuf.d dVar) {
        com.google.android.gms.internal.play_billing.u1 u1Var = (com.google.android.gms.internal.play_billing.u1) x1Var;
        int H0 = H0(bArr, i2, dVar);
        u1Var.d(dVar.a);
        while (H0 < i3) {
            int H02 = H0(bArr, H0, dVar);
            if (i != dVar.a) {
                break;
            }
            H0 = H0(bArr, H02, dVar);
            u1Var.d(dVar.a);
        }
        return H0;
    }

    public static final void K(Encoder encoder) {
        k71.k.g(encoder, "<this>");
        if ((encoder instanceof m81.r ? (m81.r) encoder : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + k71.x.a(encoder.getClass()));
    }

    public static int K0(byte[] bArr, int i, androidx.glance.appwidget.protobuf.d dVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            dVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        dVar.b = j2;
        return i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void L(a5.s sVar, androidx.constraintlayout.core.state.b bVar, c4.g gVar, String str, y3.p pVar) {
        char c;
        long j;
        char c2;
        char c3;
        int i = 0;
        str.getClass();
        switch (str.hashCode()) {
            case -1448775240:
                if (str.equals("centerVertically")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1349088399:
                if (str.equals("custom")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1221029593:
                if (str.equals("height")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1068318794:
                if (str.equals("motion")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -247669061:
                if (str.equals("hRtlBias")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -61505906:
                if (str.equals("vWeight")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 98116417:
                if (str.equals("hBias")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 111045711:
                if (str.equals("vBias")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 113126854:
                if (str.equals("width")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 398344448:
                if (str.equals("hWeight")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1404070310:
                if (str.equals("centerHorizontally")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                String w = gVar.w(str);
                androidx.constraintlayout.core.state.b b = w.equals("parent") ? pVar.b(0) : pVar.b(w);
                bVar_r7.p(b);
                bVar_r7.e(b);
                return;
            case 1:
                String w2 = gVar.w(str);
                androidx.constraintlayout.core.state.b b2 = w2.equals("parent") ? pVar.b(0) : pVar.b(w2);
                bVar_r7.o(b2);
                bVar_r7.i(b2);
                bVar_r7.p(b2);
                bVar_r7.e(b2);
                return;
            case 2:
                c4.g u = gVar.u(str);
                c4.g gVar2 = u instanceof c4.g ? u : null;
                if (gVar2 == null) {
                    return;
                }
                ArrayList A = gVar2.A();
                int size = A.size();
                while (i < size) {
                    Object obj = A.get(i);
                    i++;
                    String str2 = (String) obj;
                    c4.c n = gVar2.n(str2);
                    if (n instanceof c4.e) {
                        float d = n.d();
                        if (bVar_r7.i0 == null) {
                            bVar_r7.i0 = new HashMap();
                        }
                        bVar_r7.i0.put(str2, Float.valueOf(d));
                    } else if (n instanceof c4.h) {
                        String b3 = n.b();
                        if (b3.startsWith("#")) {
                            String substring = b3.substring(1);
                            if (substring.length() == 6) {
                                substring = "FF".concat(substring);
                            }
                            j = Long.parseLong(substring, 16);
                        } else {
                            j = -1;
                        }
                        if (j != -1) {
                            bVar_r7.h0.put(str2, Integer.valueOf((int) j));
                        }
                    }
                }
                return;
            case 3:
                bVar_r7.z = sVar.s(gVar.n(str));
                return;
            case 4:
                bVar_r7.A = sVar.s(gVar.n(str));
                return;
            case 5:
                bVar_r7.B = sVar.s(gVar.n(str));
                return;
            case 6:
                bVar_r7.C = pVar.a.a(sVar.s(gVar.n(str)));
                return;
            case 7:
                bVar_r7.D = pVar.a.a(sVar.s(gVar.n(str)));
                return;
            case '\b':
                bVar_r7.E = pVar.a.a(sVar.s(gVar.n(str)));
                return;
            case '\t':
                bVar_r7.e0 = j0(gVar, str, pVar, pVar.a);
                return;
            case '\n':
                c4.g n2 = gVar.n(str);
                if (n2 instanceof c4.g) {
                    c4.g gVar3 = n2;
                    b4.o oVar = new b4.o();
                    oVar.a = new int[10];
                    oVar.b = new int[10];
                    oVar.c = 0;
                    oVar.d = new int[10];
                    oVar.e = new float[10];
                    oVar.f = 0;
                    oVar.g = new int[5];
                    oVar.h = new String[5];
                    oVar.i = 0;
                    ArrayList A2 = gVar3.A();
                    int size2 = A2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = A2.get(i2);
                        i2++;
                        String str3 = (String) obj2;
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case -1897525331:
                                if (str3.equals("stagger")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1310311125:
                                if (str3.equals("easing")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1285003983:
                                if (str3.equals("quantize")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -791482387:
                                if (str3.equals("pathArc")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -236944793:
                                if (str3.equals("relativeTo")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                oVar.a(600, gVar3.p(str3));
                                continue;
                            case 1:
                                oVar.c(gVar3.w(str3), 603);
                                continue;
                            case 2:
                                c4.a n3 = gVar3.n(str3);
                                if (n3 instanceof c4.a) {
                                    c4.a aVar = n3;
                                    int size3 = ((c4.b) aVar).v.size();
                                    if (size3 <= 0) {
                                        break;
                                    } else {
                                        oVar.b(610, aVar.q(0));
                                        if (size3 <= 1) {
                                            break;
                                        } else {
                                            oVar.c(aVar.v(1), 611);
                                            if (size3 > 2) {
                                                oVar.a(602, aVar.o(2));
                                            }
                                        }
                                    }
                                } else {
                                    c4.c n4 = gVar3.n(str3);
                                    if (n4 == null) {
                                        StringBuilder v = jo.f4.v("no int found for key <", str3, ">, found [");
                                        v.append(n4.g());
                                        v.append("] : ");
                                        v.append(n4);
                                        throw new CLParsingException(v.toString(), gVar3);
                                    }
                                    oVar.b(610, n4.e());
                                }
                            case 3:
                                String w3 = gVar3.w(str3);
                                String[] strArr = {"none", "startVertical", "startHorizontal", "flip", "below", "above"};
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= 6) {
                                        i3 = -1;
                                    } else if (!strArr[i3].equals(w3)) {
                                        i3++;
                                    }
                                }
                                if (i3 != -1) {
                                    oVar.b(607, i3);
                                    break;
                                } else {
                                    System.err.println("0 pathArc = '" + w3 + "'");
                                    break;
                                }
                            case 4:
                                oVar.c(gVar3.w(str3), 605);
                                break;
                        }
                    }
                    bVar_r7.getClass();
                    return;
                }
                return;
            case 11:
                bVar_r7.x = sVar.s(gVar.n(str));
                return;
            case '\f':
                bVar_r7.y = sVar.s(gVar.n(str));
                return;
            case '\r':
                bVar_r7.G = sVar.s(gVar.n(str));
                return;
            case 14:
                bVar_r7.H = sVar.s(gVar.n(str));
                return;
            case 15:
                float s = sVar.s(gVar.n(str));
                if (!pVar.b) {
                    s = 1.0f - s;
                }
                bVar_r7.h = s;
                return;
            case 16:
                bVar_r7.g = sVar.s(gVar.n(str));
                return;
            case 17:
                bVar_r7.F = sVar.s(gVar.n(str));
                return;
            case 18:
                bVar_r7.h = sVar.s(gVar.n(str));
                return;
            case 19:
                bVar_r7.i = sVar.s(gVar.n(str));
                return;
            case 20:
                bVar_r7.d0 = j0(gVar, str, pVar, pVar.a);
                return;
            case 21:
                bVar_r7.f = sVar.s(gVar.n(str));
                return;
            case 22:
                String w4 = gVar.w(str);
                androidx.constraintlayout.core.state.b b4 = w4.equals("parent") ? pVar.b(0) : pVar.b(w4);
                bVar_r7.o(b4);
                bVar_r7.i(b4);
                return;
            case 23:
                String w5 = gVar.w(str);
                w5.getClass();
                switch (w5.hashCode()) {
                    case -1901805651:
                        if (w5.equals("invisible")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 3178655:
                        if (w5.equals("gone")) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 466743410:
                        if (w5.equals("visible")) {
                            c3 = 2;
                            break;
                        }
                        c3 = 65535;
                        break;
                    default:
                        c3 = 65535;
                        break;
                }
                switch (c3) {
                    case 0:
                        bVar_r7.I = 4;
                        bVar_r7.F = 0.0f;
                        return;
                    case 1:
                        bVar_r7.I = 8;
                        return;
                    case 2:
                        bVar_r7.I = 0;
                        return;
                    default:
                        return;
                }
            default:
                i0(sVar, bVar_r7, gVar, str, pVar);
                return;
        }
    }

    public static int L0(Object obj, com.google.android.gms.internal.play_billing.o2 o2Var, byte[] bArr, int i, int i2, int i3, androidx.glance.appwidget.protobuf.d dVar) {
        com.google.android.gms.internal.play_billing.i2 i2Var = (com.google.android.gms.internal.play_billing.i2) o2Var;
        int i4 = dVar.d + 1;
        dVar.d = i4;
        if (i4 >= 100) {
            throw new zzgc("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int t = i2Var.t(obj, bArr, i, i2, i3, dVar);
        dVar.d--;
        dVar.c = obj;
        return t;
    }

    public static final yz0.p M(bn0.d dVar) {
        k71.k.g(dVar, "<this>");
        double d = dVar.e;
        ArrayList arrayList = dVar.a;
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            if (i < 0) {
                sy.d0.x();
                throw null;
            }
            wz0.e c = wz0.d.c((String) obj, 2);
            arrayList2.add(new yz0.m1(c.b, c.a, dVar.b + i));
            i = i3;
        }
        return new yz0.p(d, dVar.b, dVar.c, dVar.d, arrayList2);
    }

    public static int M0(Object obj, com.google.android.gms.internal.play_billing.o2 o2Var, byte[] bArr, int i, int i2, androidx.glance.appwidget.protobuf.d dVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = I0(i4, bArr, i3, dVar);
            i4 = dVar.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = dVar.d + 1;
        dVar.d = i6;
        if (i6 >= 100) {
            throw new zzgc("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i7 = i5 + i4;
        o2Var.f(obj, bArr, i5, i7, dVar);
        dVar.d--;
        dVar.c = obj;
        return i7;
    }

    public static final yz0.t1 N(bn0.e eVar) {
        ArrayList arrayList = eVar.f;
        String str = eVar.d;
        bn0.a aVar = eVar.a;
        Object obj = null;
        Language language = new Language(aVar != null ? aVar.c : "", aVar != null ? aVar.a : null);
        int i = eVar.c;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            bn0.d dVar = (bn0.d) obj2;
            yz0.p M = dVar.e > 0.0d ? M(dVar) : null;
            if (M != null) {
                arrayList2.add(M);
            }
        }
        List x0 = x61.m.x0(arrayList2, 4);
        if (x0.isEmpty()) {
            List x02 = x61.m.x0(arrayList, 4);
            ArrayList arrayList3 = new ArrayList(x61.n.F(x02, 10));
            Iterator it = x02.iterator();
            while (it.hasNext()) {
                arrayList3.add(M((bn0.d) it.next()));
            }
            x0 = arrayList3;
        }
        List x03 = x61.m.x0(arrayList, 16);
        ArrayList arrayList4 = new ArrayList(x61.n.F(x03, 10));
        Iterator it2 = x03.iterator();
        while (it2.hasNext()) {
            arrayList4.add(M((bn0.d) it2.next()));
        }
        Iterator it3 = x61.m.x0(arrayList, 16).iterator();
        if (it3.hasNext()) {
            obj = it3.next();
            if (it3.hasNext()) {
                int i3 = ((bn0.d) obj).c;
                do {
                    Object next = it3.next();
                    int i4 = ((bn0.d) next).c;
                    if (i3 < i4) {
                        obj = next;
                        i3 = i4;
                    }
                } while (it3.hasNext());
            }
        }
        bn0.d dVar2 = (bn0.d) obj;
        int i5 = dVar2 != null ? dVar2.c : 0;
        String str2 = eVar.e;
        bn0.c cVar = eVar.b;
        return new yz0.t1(cVar != null ? cVar.b : "", cVar != null ? cVar.c.b : "", cVar != null ? cVar.c.c : "", str2, str, language, i5, i, x0, arrayList4);
    }

    public static long N0(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static final l81.i O(Decoder decoder) {
        k71.k.g(decoder, "<this>");
        l81.i iVar = decoder instanceof l81.i ? (l81.i) decoder : null;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + k71.x.a(decoder.getClass()));
    }

    public static final List P(lt.j jVar) {
        ArrayList arrayList;
        lt.g gVar;
        lt.a aVar;
        List list;
        lt.i iVar;
        lt.b bVar_r7;
        List list2;
        lt.h hVar;
        lt.c cVar;
        List list3;
        int i = 0;
        if (jVar != null && (hVar = jVar.b) != null && (cVar = hVar.b) != null && (list3 = cVar.b) != null) {
            ArrayList S = x61.m.S(list3);
            ArrayList arrayList2 = new ArrayList(x61.n.F(S, 10));
            int size = S.size();
            while (i < size) {
                Object obj = S.get(i);
                i++;
                arrayList2.add(b4.p0(((lt.f) obj).c));
            }
            return arrayList2;
        }
        if (jVar != null && (iVar = jVar.d) != null && (bVar_r7 = iVar.b) != null && (list2 = bVar_r7.b) != null) {
            ArrayList S2 = x61.m.S(list2);
            ArrayList arrayList3 = new ArrayList(x61.n.F(S2, 10));
            int size2 = S2.size();
            while (i < size2) {
                Object obj2 = S2.get(i);
                i++;
                arrayList3.add(b4.p0(((lt.e) obj2).c));
            }
            return arrayList3;
        }
        if (jVar == null || (gVar = jVar.c) == null || (aVar = gVar.b) == null || (list = aVar.b) == null) {
            arrayList = null;
        } else {
            ArrayList S3 = x61.m.S(list);
            arrayList = new ArrayList(x61.n.F(S3, 10));
            int size3 = S3.size();
            while (i < size3) {
                Object obj3 = S3.get(i);
                i++;
                arrayList.add(b4.p0(((lt.d) obj3).c));
            }
        }
        return arrayList == null ? x61.r.r : arrayList;
    }

    public static final LinkedHashMap Q(tz.h hVar) {
        ArrayList arrayList;
        int i;
        w61.k kVar;
        w61.k kVar2;
        Iterable iterable = hVar.a;
        if (iterable == null) {
            iterable = x61.r.r;
        }
        ArrayList S = x61.m.S(iterable);
        int i2 = 10;
        int s = x61.x.s(x61.n.F(S, 10));
        if (s < 16) {
            s = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s);
        int size = S.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = S.get(i3);
            i3++;
            tz.g gVar = (tz.g) obj;
            tz.o oVar = gVar.b;
            if (oVar != null) {
                String str = oVar.a;
                l01.y yVar = new l01.y(str);
                Integer num = oVar.b;
                kVar = new w61.k(yVar, new ProjectV2Field$ProjectV2TextField(str, num != null ? num.intValue() : 0, oVar.c, z3.R(oVar.d)));
                arrayList = S;
                i = size;
            } else {
                tz.r4 r4Var = gVar.c;
                if (r4Var != null) {
                    String str2 = r4Var.a;
                    l01.y yVar2 = new l01.y(str2);
                    Integer num2 = r4Var.b;
                    int intValue = num2 != null ? num2.intValue() : 0;
                    String str3 = r4Var.c;
                    ProjectFieldType R = z3.R(r4Var.d);
                    ArrayList arrayList2 = r4Var.e;
                    ArrayList arrayList3 = new ArrayList(x61.n.F(arrayList2, i2));
                    int size2 = arrayList2.size();
                    int i4 = 0;
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj2 = arrayList2.get(i5);
                        i5++;
                        int i6 = i4 + 1;
                        if (i4 < 0) {
                            sy.d0.x();
                            throw null;
                        }
                        tz.i5 i5Var = ((tz.q4) obj2).b;
                        arrayList3.add(new ProjectFieldOption$SingleOption(i4, i5Var.a, i5Var.b, i5Var.c));
                        i4 = i6;
                        S = S;
                        size = size;
                    }
                    arrayList = S;
                    i = size;
                    kVar2 = new w61.k(yVar2, new ProjectV2Field$ProjectV2SingleSelectField(str2, intValue, str3, R, arrayList3));
                } else {
                    arrayList = S;
                    i = size;
                    tz.j4 j4Var = gVar.d;
                    if (j4Var != null) {
                        String str4 = j4Var.a;
                        tz.h4 h4Var = j4Var.e;
                        l01.y yVar3 = new l01.y(str4);
                        Integer num3 = j4Var.b;
                        int intValue2 = num3 != null ? num3.intValue() : 0;
                        String str5 = j4Var.c;
                        ProjectFieldType R2 = z3.R(j4Var.d);
                        ArrayList arrayList4 = h4Var.b;
                        ArrayList arrayList5 = new ArrayList(x61.n.F(arrayList4, 10));
                        int size3 = arrayList4.size();
                        int i7 = 0;
                        while (i7 < size3) {
                            Object obj3 = arrayList4.get(i7);
                            i7++;
                            tz.o4 o4Var = ((tz.g4) obj3).b;
                            arrayList5.add(new ProjectFieldOption$Iteration(o4Var.a, o4Var.b, o4Var.c, o4Var.d, o4Var.e));
                            arrayList4 = arrayList4;
                        }
                        ArrayList arrayList6 = h4Var.c;
                        ArrayList arrayList7 = new ArrayList(x61.n.F(arrayList6, 10));
                        int size4 = arrayList6.size();
                        int i8 = 0;
                        while (i8 < size4) {
                            Object obj4 = arrayList6.get(i8);
                            i8++;
                            tz.o4 o4Var2 = ((tz.i4) obj4).b;
                            arrayList7.add(new ProjectFieldOption$Iteration(o4Var2.a, o4Var2.b, o4Var2.c, o4Var2.d, o4Var2.e));
                            arrayList6 = arrayList6;
                        }
                        kVar2 = new w61.k(yVar3, new ProjectV2Field$ProjectV2IterationField(str4, intValue2, str5, R2, arrayList5, arrayList7, h4Var.a));
                    } else {
                        kVar = new w61.k(new l01.y(""), new ProjectV2Field$ProjectV2UnknownField());
                    }
                }
                kVar = kVar2;
            }
            linkedHashMap.put(kVar.r, kVar.s);
            S = arrayList;
            size = i;
            i2 = 10;
        }
        return linkedHashMap;
    }

    public static final Object R(w21.o oVar, c71.c cVar) {
        if (!oVar.i()) {
            v71.l lVar = new v71.l(1, b4.T(cVar));
            lVar.t();
            oVar.a(f81.a.r, new f41.d(lVar, 2));
            Object s = lVar.s();
            b71.a aVar = b71.a.r;
            return s;
        }
        Exception g = oVar.g();
        if (g != null) {
            throw g;
        }
        if (!oVar.d) {
            return oVar.h();
        }
        throw new CancellationException("Task " + oVar + " was cancelled normally.");
    }

    public static void S(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static final void T(ia.d dVar, String str, String str2) {
        k71.k.g(dVar, "<this>");
        k71.k.g(str, "name");
        k71.k.g(str2, "value");
        ArrayList arrayList = dVar.a;
        arrayList.add(str);
        arrayList.add(t71.p.t0(str2).toString());
    }

    public static q81.q V(String str) {
        k71.k.g(str, "<this>");
        t71.l c = q81.q.d.c(str, 0);
        if (c == null) {
            throw new IllegalArgumentException(no.a.i('\"', "No subtype found for: \"", str));
        }
        String str2 = (String) c.a().get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        k71.k.f(lowerCase, "toLowerCase(...)");
        String lowerCase2 = ((String) c.a().get(2)).toLowerCase(locale);
        k71.k.f(lowerCase2, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        int i = ((q71.e) c.b()).s;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return new q81.q(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            t71.l c2 = q81.q.e.c(str, i2);
            if (c2 == null) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(i2);
                k71.k.f(substring, "substring(...)");
                sb.append(substring);
                sb.append("\" for: \"");
                throw new IllegalArgumentException(a0.s0.m(sb, str, '\"').toString());
            }
            o1.l lVar = c2.c;
            t71.j b = lVar.b(1);
            String str3 = b != null ? b.a : null;
            if (str3 == null) {
                i = ((q71.e) c2.b()).s;
            } else {
                t71.j b2 = lVar.b(2);
                String str4 = b2 != null ? b2.a : null;
                if (str4 == null) {
                    t71.j b3 = lVar.b(3);
                    k71.k.d(b3);
                    str4 = b3.a;
                } else if (t71.p.j0(str4, '\'') && t71.p.M(str4, '\'') && str4.length() > 2) {
                    str4 = str4.substring(1, str4.length() - 1);
                    k71.k.f(str4, "substring(...)");
                }
                arrayList.add(str3);
                arrayList.add(str4);
                i = ((q71.e) c2.b()).s;
            }
        }
    }

    public static ColorStateList W(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (c = o4.b.c(context, resourceId)) == null) ? typedArray.getColorStateList(i) : c;
    }

    public static ColorStateList X(Context context, l51.h hVar, int i) {
        int resourceId;
        ColorStateList c;
        TypedArray typedArray = (TypedArray) hVar.t;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (c = o4.b.c(context, resourceId)) == null) ? hVar.q(i) : c;
    }

    public static Drawable Y(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable o;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (o = w8.s.o(context, resourceId)) == null) ? typedArray.getDrawable(i) : o;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0085 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x007d, B:14:0x0085, B:15:0x0090, B:22:0x00a0, B:24:0x006c, B:28:0x00a3, B:32:0x00a8, B:33:0x00a9, B:46:0x0066, B:17:0x0091, B:19:0x0097), top: B:7:0x0021, outer: #1, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa A[Catch: all -> 0x00b3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00b3, blocks: (B:35:0x00aa, B:55:0x00b7, B:56:0x00ba, B:11:0x002d, B:12:0x007d, B:14:0x0085, B:15:0x0090, B:22:0x00a0, B:24:0x006c, B:28:0x00a3, B:32:0x00a8, B:33:0x00a9, B:46:0x0066, B:17:0x0091, B:19:0x0097, B:52:0x00b5), top: B:7:0x0021, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007a -> B:12:0x007d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Z(c71.c cVar) {
        k6.a aVar;
        int i;
        x71.v a2;
        v1.e bVar_r7;
        x71.c cVar2;
        AtomicBoolean atomicBoolean;
        boolean z;
        try {
            try {
                if (cVar instanceof k6.a) {
                    aVar = (k6.a) cVar;
                    int i2 = aVar.z;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        aVar.z = i2 - Integer.MIN_VALUE;
                        Object obj = aVar.y;
                        b71.a aVar2 = b71.a.r;
                        i = aVar.z;
                        if (i != 0) {
                            sy.y.j(obj);
                            a2 = t.e.a(1, 6, (x71.a) null);
                            AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                            fg.d dVar = new fg.d(17, atomicBoolean2, a2);
                            synchronized (v1.m.c) {
                                v1.m.i = x61.m.m0(v1.m.i, dVar);
                            }
                            v1.m.a();
                            bVar_r7 = new c5.b(24, dVar);
                            cVar2 = new x71.c(a2);
                            atomicBoolean = atomicBoolean2;
                            aVar.u = atomicBoolean;
                            aVar.v = bVar_r7;
                            aVar.w = a2;
                            aVar.x = cVar2;
                            aVar.z = 1;
                            obj = cVar2.b(aVar);
                            if (obj == aVar2) {
                            }
                            if (((Boolean) obj).booleanValue()) {
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            cVar2 = aVar.x;
                            a2 = aVar.w;
                            bVar_r7 = aVar.v;
                            atomicBoolean = aVar.u;
                            sy.y.j(obj);
                            if (((Boolean) obj).booleanValue()) {
                                atomicBoolean.set(false);
                                synchronized (v1.m.c) {
                                    x.i0 i0Var = ((v1.b) v1.m.j).h;
                                    z = i0Var != null && i0Var.h();
                                }
                                if (z) {
                                    v1.m.a();
                                }
                                aVar.u = atomicBoolean;
                                aVar.v = bVar_r7;
                                aVar.w = a2;
                                aVar.x = cVar2;
                                aVar.z = 1;
                                obj = cVar2.b(aVar);
                                if (obj == aVar2) {
                                    return aVar2;
                                }
                                if (((Boolean) obj).booleanValue()) {
                                    a2.m((CancellationException) null);
                                    bVar_r7.a();
                                    return w61.a0.a;
                                }
                            }
                        }
                    }
                }
                if (i != 0) {
                }
            } finally {
            }
        } catch (Throwable th) {
            bVar_r7.a();
            throw th;
        }
        aVar = new k6.a(cVar);
        Object obj2 = aVar.y;
        b71.a aVar22 = b71.a.r;
        i = aVar.z;
    }

    public static final void a0(String str) {
        k71.k.g(str, "name");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                sy.r.m(16);
                String num = Integer.toString(charAt, 16);
                k71.k.f(num, "toString(...)");
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                a0.s0.w(i, num, " at ", " in header name: ", sb);
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void b0(String str, String str2) {
        k71.k.g(str, "value");
        k71.k.g(str2, "name");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                sy.r.m(16);
                String num = Integer.toString(charAt, 16);
                k71.k.f(num, "toString(...)");
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                a0.s0.w(i, num, " at ", " in ", sb);
                sb.append(str2);
                sb.append(" value");
                sb.append(r81.e.k(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static int c0(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        throw new IllegalArgumentException(no.a.k("type needs to be >= FIRST and <= LAST, type=", i));
    }

    public static boolean d0(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean e0(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final void f0(String str) {
        k71.k.g(str, "key");
        throw new IllegalArgumentException(f1.e.z("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static q81.q g0(String str) {
        k71.k.g(str, "<this>");
        try {
            return V(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h0(int i, y3.p pVar, a5.s sVar, c4.a aVar) {
        String b;
        d4.h e = i == 0 ? pVar.e(1) : (d4.i) pVar.e(2);
        c4.a l = aVar.l(1);
        if (l instanceof c4.a) {
            c4.a aVar2 = l;
            if (((c4.b) aVar2).v.size() < 1) {
                return;
            }
            for (int i2 = 0; i2 < ((c4.b) aVar2).v.size(); i2++) {
                e.q(new Object[]{aVar2.v(i2)});
            }
            if (((c4.b) aVar).v.size() > 2) {
                c4.g l2 = aVar.l(2);
                if (l2 instanceof c4.g) {
                    c4.g gVar = l2;
                    ArrayList A = gVar.A();
                    int size = A.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = A.get(i3);
                        i3++;
                        String str = (String) obj;
                        str.getClass();
                        if (str.equals("style")) {
                            c4.a n = gVar.n(str);
                            if (n instanceof c4.a) {
                                c4.a aVar3 = n;
                                if (((c4.b) aVar3).v.size() > 1) {
                                    b = aVar3.v(0);
                                    ((d4.c) e).n0 = aVar3.o(1);
                                    b.getClass();
                                    if (!b.equals("packed")) {
                                        ((d4.c) e).t0 = androidx.constraintlayout.core.state.i.t;
                                    } else if (b.equals("spread_inside")) {
                                        ((d4.c) e).t0 = androidx.constraintlayout.core.state.i.s;
                                    } else {
                                        ((d4.c) e).t0 = androidx.constraintlayout.core.state.i.r;
                                    }
                                }
                            }
                            b = n.b();
                            b.getClass();
                            if (!b.equals("packed")) {
                            }
                        } else {
                            i0(sVar, e, gVar, str, pVar);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void i0(a5.s sVar, androidx.constraintlayout.core.state.b bVar_r7, c4.g gVar, String str, y3.p pVar) {
        androidx.constraintlayout.core.state.b b;
        char c;
        boolean z;
        boolean z2;
        char c2;
        boolean z3;
        boolean z4 = pVar.b;
        c4.a u = gVar.u(str);
        c4.a aVar = u instanceof c4.a ? u : null;
        if (aVar == null || ((c4.b) aVar).v.size() <= 1) {
            String x = gVar.x(str);
            if (x != null) {
                b = x.equals("parent") ? pVar.b(0) : pVar.b(x);
                str.getClass();
                switch (str) {
                    case "baseline":
                        pVar.a(bVar_r7.a);
                        pVar.a(b.a);
                        bVar_r7.j0 = 15;
                        bVar_r7.X = b;
                        break;
                    case "bottom":
                        bVar_r7.e(b);
                        break;
                    case "end":
                        if (!z4) {
                            bVar_r7.j0 = 1;
                            bVar_r7.J = b;
                            break;
                        } else {
                            bVar_r7.j0 = 4;
                            bVar_r7.M = b;
                            break;
                        }
                    case "top":
                        bVar_r7.p(b);
                        break;
                    case "start":
                        if (!z4) {
                            bVar_r7.j0 = 4;
                            bVar_r7.M = b;
                            break;
                        } else {
                            bVar_r7.j0 = 1;
                            bVar_r7.J = b;
                            break;
                        }
                }
            }
            return;
        }
        String v = aVar.v(0);
        c4.c s = aVar.s(1);
        String b2 = s instanceof c4.h ? s.b() : null;
        float a2 = ((c4.b) aVar).v.size() > 2 ? pVar.a.a(sVar.s(aVar.s(2))) : 0.0f;
        float a3 = ((c4.b) aVar).v.size() > 3 ? pVar.a.a(sVar.s(aVar.s(3))) : 0.0f;
        androidx.constraintlayout.core.state.b b3 = v.equals("parent") ? pVar.b(0) : pVar.b(v);
        str.getClass();
        switch (str.hashCode()) {
            case -1720785339:
                if (str.equals("baseline")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1498085729:
                if (str.equals("circular")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1383228885:
                if (str.equals("bottom")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 100571:
                if (str.equals("end")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 115029:
                if (str.equals("top")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3317767:
                if (str.equals("left")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 108511772:
                if (str.equals("right")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                b2.getClass();
                switch (b2) {
                    case "baseline":
                        pVar.a(bVar_r7.a);
                        pVar.a(b3.a);
                        bVar_r7.j0 = 15;
                        bVar_r7.X = b3;
                        break;
                    case "bottom":
                        pVar.a(bVar_r7.a);
                        bVar_r7.j0 = 17;
                        bVar_r7.Z = b3;
                        break;
                    case "top":
                        pVar.a(bVar_r7.a);
                        bVar_r7.j0 = 16;
                        bVar_r7.Y = b3;
                        break;
                }
                z = false;
                z2 = true;
                break;
            case 1:
                float s2 = sVar.s(aVar.l(1));
                float a4 = ((c4.b) aVar).v.size() > 2 ? pVar.a.a(sVar.s(aVar.s(2))) : 0.0f;
                bVar_r7.a0 = bVar_r7.j(b3);
                bVar_r7.b0 = s2;
                bVar_r7.c0 = a4;
                bVar_r7.j0 = 20;
                z = false;
                z2 = true;
                break;
            case 2:
                b2.getClass();
                switch (b2) {
                    case "baseline":
                        pVar.a(b3.a);
                        bVar_r7.j0 = 14;
                        bVar_r7.W = b3;
                        break;
                    case "bottom":
                        bVar_r7.e(b3);
                        break;
                    case "top":
                        bVar_r7.j0 = 12;
                        bVar_r7.U = b3;
                        break;
                }
                z = false;
                z2 = true;
                break;
            case 3:
                z2 = !z4;
                z = true;
                break;
            case 4:
                b2.getClass();
                switch (b2) {
                    case "baseline":
                        pVar.a(b3.a);
                        bVar_r7.j0 = 11;
                        bVar_r7.T = b3;
                        break;
                    case "bottom":
                        bVar_r7.j0 = 10;
                        bVar_r7.S = b3;
                        break;
                    case "top":
                        bVar_r7.p(b3);
                        break;
                }
                z = false;
                z2 = true;
                break;
            case 5:
                z = true;
                z2 = true;
                break;
            case 6:
                z = true;
                z2 = false;
                break;
            case 7:
                z2 = z4;
                z = true;
                break;
            default:
                z = false;
                z2 = true;
                break;
        }
        if (z) {
            b2.getClass();
            switch (b2.hashCode()) {
                case 100571:
                    if (b2.equals("end")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 108511772:
                    if (b2.equals("right")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109757538:
                    if (b2.equals("start")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    z3 = !z4;
                    break;
                case 1:
                    z3 = false;
                    break;
                case 2:
                    z3 = z4;
                    break;
                default:
                    z3 = true;
                    break;
            }
            if (z2) {
                if (z3) {
                    bVar_r7.j0 = 1;
                    bVar_r7.J = b3;
                } else {
                    bVar_r7.j0 = 2;
                    bVar_r7.K = b3;
                }
            } else if (z3) {
                bVar_r7.j0 = 3;
                bVar_r7.L = b3;
            } else {
                bVar.j0 = 4;
                bVar.M = b3;
            }
        }
        bVar.l(Float.valueOf(a2)).n(Float.valueOf(a3));
    }

    public static androidx.constraintlayout.core.state.f j0(c4.g gVar, String str, y3.p pVar, w51.a0 a0Var) {
        c4.g n = gVar.n(str);
        androidx.constraintlayout.core.state.f b = androidx.constraintlayout.core.state.f.b(0);
        if (n instanceof c4.h) {
            return k0(n.b());
        }
        if (n instanceof c4.e) {
            return androidx.constraintlayout.core.state.f.b(pVar.c(Float.valueOf(a0Var.a(gVar.p(str)))));
        }
        if (n instanceof c4.g) {
            c4.g gVar2 = n;
            String x = gVar2.x("value");
            if (x != null) {
                b = k0(x);
            }
            c4.e u = gVar2.u("min");
            if (u != null) {
                if (u instanceof c4.e) {
                    int c = pVar.c(Float.valueOf(a0Var.a(u.d())));
                    if (c >= 0) {
                        b.a = c;
                    }
                } else if (u instanceof c4.h) {
                    b.a = -2;
                }
            }
            c4.e u2 = gVar2.u("max");
            if (u2 != null) {
                if (u2 instanceof c4.e) {
                    int c2 = pVar.c(Float.valueOf(a0Var.a(u2.d())));
                    if (b.b >= 0) {
                        b.b = c2;
                        return b;
                    }
                } else if ((u2 instanceof c4.h) && b.g) {
                    b.f = androidx.constraintlayout.core.state.f.i;
                    b.b = Integer.MAX_VALUE;
                }
            }
        }
        return b;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static androidx.constraintlayout.core.state.f k0(String str) {
        androidx.constraintlayout.core.state.f b = androidx.constraintlayout.core.state.f.b(0);
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1460244870:
                if (str.equals("preferWrap")) {
                    c = 0;
                    break;
                }
                break;
            case -995424086:
                if (str.equals("parent")) {
                    c = 1;
                    break;
                }
                break;
            case -895684237:
                if (str.equals("spread")) {
                    c = 2;
                    break;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    c = 3;
                    break;
                }
                break;
        }
        String str2 = androidx.constraintlayout.core.state.f.i;
        String str3 = androidx.constraintlayout.core.state.f.j;
        switch (c) {
            case 0:
                return androidx.constraintlayout.core.state.f.c(str2);
            case 1:
                return new androidx.constraintlayout.core.state.f(androidx.constraintlayout.core.state.f.k);
            case 2:
                return androidx.constraintlayout.core.state.f.c(str3);
            case 3:
                return new androidx.constraintlayout.core.state.f(str2);
            default:
                if (str.endsWith("%")) {
                    float parseFloat = Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f;
                    androidx.constraintlayout.core.state.f fVar = new androidx.constraintlayout.core.state.f(androidx.constraintlayout.core.state.f.l);
                    fVar.c = parseFloat;
                    fVar.g = true;
                    fVar.b = 0;
                    return fVar;
                }
                if (!str.contains(":")) {
                    return b;
                }
                androidx.constraintlayout.core.state.f fVar2 = new androidx.constraintlayout.core.state.f(androidx.constraintlayout.core.state.f.m);
                fVar2.e = str;
                fVar2.f = str3;
                fVar2.g = true;
                return fVar2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void l0(int i, y3.p pVar, String str, c4.g gVar) {
        char c;
        boolean z;
        boolean z2;
        char c2;
        ArrayList A = gVar.A();
        androidx.constraintlayout.core.state.b b = pVar.b(str);
        if (i == 0) {
            pVar.d(str, 0);
        } else {
            pVar.d(str, 1);
        }
        boolean z3 = pVar.b || i == 0;
        d4.g gVar2 = (d4.g) b.c;
        int size = A.size();
        boolean z4 = false;
        int i2 = 0;
        boolean z5 = true;
        float f = 0.0f;
        while (i2 < size) {
            Object obj = A.get(i2);
            i2++;
            String str2 = (String) obj;
            str2.getClass();
            switch (str2.hashCode()) {
                case -678927291:
                    if (str2.equals("percent")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 100571:
                    if (str2.equals("end")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3317767:
                    if (str2.equals("left")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 108511772:
                    if (str2.equals("right")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109757538:
                    if (str2.equals("start")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    c4.a u = gVar.u(str2);
                    c4.a aVar = u instanceof c4.a ? u : null;
                    if (aVar != null) {
                        z = true;
                        if (((c4.b) aVar).v.size() > 1) {
                            z2 = false;
                            String v = aVar.v(0);
                            float o = aVar.o(1);
                            v.getClass();
                            switch (v.hashCode()) {
                                case 100571:
                                    if (v.equals("end")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3317767:
                                    if (v.equals("left")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 108511772:
                                    if (v.equals("right")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 109757538:
                                    if (v.equals("start")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            switch (c2) {
                                case 0:
                                    z5 = !z3;
                                    f = o;
                                    break;
                                case 1:
                                    f = o;
                                    z4 = true;
                                    z5 = true;
                                    break;
                                case 2:
                                    f = o;
                                    z5 = false;
                                    break;
                                case 3:
                                    z5 = z3;
                                    f = o;
                                    break;
                                default:
                                    f = o;
                                    break;
                            }
                        } else {
                            z2 = false;
                        }
                        z4 = true;
                        break;
                    } else {
                        f = gVar.p(str2);
                        z4 = true;
                        z5 = true;
                        z2 = false;
                        z = true;
                        break;
                    }
                case 1:
                    f = pVar.a.a(gVar.p(str2));
                    z5 = !z3;
                    z2 = false;
                    z = true;
                    break;
                case 2:
                    f = pVar.a.a(gVar.p(str2));
                    z5 = true;
                    z2 = false;
                    z = true;
                    break;
                case 3:
                    f = pVar.a.a(gVar.p(str2));
                    z5 = false;
                    z2 = false;
                    z = true;
                    break;
                case 4:
                    f = pVar.a.a(gVar.p(str2));
                    z5 = z3;
                    z2 = false;
                    z = true;
                    break;
                default:
                    z2 = false;
                    z = true;
                    break;
            }
        }
        if (z4) {
            if (z5) {
                gVar2.d = -1;
                gVar2.e = -1;
                gVar2.f = f;
                return;
            } else {
                gVar2.d = -1;
                gVar2.e = -1;
                gVar2.f = 1.0f - f;
                return;
            }
        }
        if (z5) {
            gVar2.d = gVar2.a.c(Float.valueOf(f));
            gVar2.e = -1;
            gVar2.f = 0.0f;
        } else {
            Float valueOf = Float.valueOf(f);
            gVar2.d = -1;
            gVar2.e = gVar2.a.c(valueOf);
            gVar2.f = 0.0f;
        }
    }

    public static void m0(y3.p pVar, a5.s sVar, String str, c4.g gVar) {
        androidx.constraintlayout.core.state.b b = pVar.b(str);
        androidx.constraintlayout.core.state.f fVar = b.d0;
        String str2 = androidx.constraintlayout.core.state.f.i;
        if (fVar == null) {
            b.d0 = new androidx.constraintlayout.core.state.f(str2);
        }
        if (b.e0 == null) {
            b.e0 = new androidx.constraintlayout.core.state.f(str2);
        }
        ArrayList A = gVar.A();
        int size = A.size();
        int i = 0;
        while (i < size) {
            Object obj = A.get(i);
            i++;
            L(sVar, b, gVar, (String) obj, pVar);
        }
    }

    public static final String n0(int i, int i2, Object[] objArr, androidx.compose.runtime.s sVar) {
        return ((Resources) sVar.j(w2.j0.c)).getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
    }

    public static final Object o0(a81.q qVar, boolean z, a81.q qVar2, j71.e eVar) {
        Object tVar;
        Object Y;
        try {
            if (eVar instanceof c71.a) {
                k71.z.c(2, eVar);
                tVar = eVar.s(qVar2, qVar);
            } else {
                tVar = b4.u0(eVar, qVar2, qVar);
            }
        } catch (DispatchException e) {
            Throwable th = e.r;
            qVar.X(new v71.t(th, false));
            throw th;
        } catch (Throwable th2) {
            tVar = new v71.t(th2, false);
        }
        b71.a aVar = b71.a.r;
        if (tVar == aVar || (Y = qVar.Y(tVar)) == v71.b0.e) {
            return aVar;
        }
        qVar.r0();
        if (!(Y instanceof v71.t)) {
            return v71.b0.J(Y);
        }
        if (!z) {
            TimeoutCancellationException timeoutCancellationException = ((v71.t) Y).a;
            if ((timeoutCancellationException instanceof TimeoutCancellationException) && timeoutCancellationException.r == qVar) {
                if (tVar instanceof v71.t) {
                    throw ((v71.t) tVar).a;
                }
                return tVar;
            }
        }
        throw ((v71.t) Y).a;
    }

    public static final String p0(int i, androidx.compose.runtime.s sVar) {
        return ((Resources) sVar.j(w2.j0.c)).getString(i);
    }

    public static final String q0(int i, Object[] objArr, androidx.compose.runtime.s sVar) {
        return ((Resources) sVar.j(w2.j0.c)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public static final ya0 r0(SubscriptionState subscriptionState) {
        switch (subscriptionState == null ? -1 : dz.r.a[subscriptionState.ordinal()]) {
            case -1:
                return ya0.y;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return ya0.y;
            case 2:
                return ya0.x;
            case 3:
                return ya0.v;
            case 4:
                return ya0.w;
            case 5:
                return ya0.u;
            case 6:
                return ya0.t;
        }
    }

    public static final s00 s0(ShortcutColor shortcutColor) {
        switch (shortcutColor == null ? -1 : jx0.n.a[shortcutColor.ordinal()]) {
            case -1:
                return s00.A;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return s00.u;
            case 2:
                return s00.t;
            case 3:
                return s00.v;
            case 4:
                return s00.w;
            case 5:
                return s00.z;
            case 6:
                return s00.x;
            case 7:
                return s00.y;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final yz0.j4 t0(we0.l1 l1Var) {
        com.github.service.models.response.a aVar;
        String str;
        StatusState statusState;
        we0.j1 j1Var;
        we0.j1 j1Var2;
        String str2;
        String str3;
        we0.k1 k1Var;
        we0.g1 g1Var = l1Var.h;
        we0.h1 h1Var = l1Var.g;
        String str4 = "";
        if (l1Var.e || l1Var.d) {
            aVar = null;
        } else {
            if (h1Var == null || (k1Var = h1Var.d) == null) {
                str2 = h1Var != null ? h1Var.c : null;
                if (str2 == null) {
                    str3 = "";
                    aVar = new com.github.service.models.response.a(str3, new Avatar(h1Var == null ? h1Var.b : "", h1Var == null ? h1Var.a : ""), (String) null, false, (String) null, 60);
                }
            } else {
                str2 = k1Var.a;
            }
            str3 = str2;
            aVar = new com.github.service.models.response.a(str3, new Avatar(h1Var == null ? h1Var.b : "", h1Var == null ? h1Var.a : ""), (String) null, false, (String) null, 60);
        }
        if (g1Var == null || (j1Var2 = g1Var.d) == null) {
            String str5 = g1Var != null ? g1Var.c : null;
            str = str5 == null ? "" : str5;
        } else {
            str = j1Var2.b;
        }
        String str6 = g1Var != null ? g1Var.b : "";
        if (g1Var != null && (j1Var = g1Var.d) != null) {
            str4 = j1Var.a;
        }
        com.github.service.models.response.a aVar2 = new com.github.service.models.response.a(str, new Avatar(str6, str4), (String) null, false, (String) null, 60);
        String str7 = l1Var.a;
        String str8 = l1Var.c;
        ZonedDateTime zonedDateTime = l1Var.b;
        String str9 = l1Var.f;
        we0.i1 i1Var = l1Var.i;
        if (i1Var == null || (statusState = sy.q.o(i1Var.b)) == null) {
            statusState = StatusState.UNKNOWN__;
        }
        return new yz0.j4(str7, str8, zonedDateTime, str9, statusState, aVar, aVar2);
    }

    public static final CheckConclusionState u0(da0 da0Var) {
        int ordinal = da0Var.ordinal();
        if (ordinal == 0) {
            return CheckConclusionState.FAILURE;
        }
        if (ordinal == 1) {
            return null;
        }
        if (ordinal == 2) {
            return CheckConclusionState.FAILURE;
        }
        if (ordinal == 3) {
            return null;
        }
        if (ordinal == 4) {
            return CheckConclusionState.SUCCESS;
        }
        if (ordinal == 5) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final i01.b v0(ss0.g gVar) {
        String str = gVar.a;
        com.github.service.models.response.a e = k41.b.e(gVar.b.b);
        Integer num = gVar.c;
        boolean z = gVar.d;
        boolean z2 = gVar.e;
        int i = gVar.f;
        ss0.f fVar = gVar.g;
        return new i01.b(str, e, num, z, z2, i, fVar != null ? k21.f.J(fVar.c) : null);
    }

    public static final CheckConclusionState w0(m10.t3 t3Var) {
        switch (t3Var == null ? -1 : dz.b.a[t3Var.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return CheckConclusionState.ACTION_REQUIRED;
            case 2:
                return CheckConclusionState.CANCELLED;
            case 3:
                return CheckConclusionState.FAILURE;
            case 4:
                return CheckConclusionState.NEUTRAL;
            case 5:
                return CheckConclusionState.SKIPPED;
            case 6:
                return CheckConclusionState.STALE;
            case 7:
                return CheckConclusionState.STARTUP_FAILURE;
            case 8:
                return CheckConclusionState.SUCCESS;
            case 9:
                return CheckConclusionState.TIMED_OUT;
            case 10:
                return CheckConclusionState.UNKNOWN__;
        }
    }

    public static final IssueState x0(jc jcVar) {
        int ordinal = jcVar.ordinal();
        if (ordinal == 0) {
            return IssueState.CLOSED;
        }
        if (ordinal == 1) {
            return IssueState.OPEN;
        }
        if (ordinal == 2) {
            return IssueState.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final SubscriptionState y0(ya0 ya0Var) {
        switch (ya0Var == null ? -1 : dz.r.b[ya0Var.ordinal()]) {
            case -1:
                return SubscriptionState.UNKNOWN__;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return SubscriptionState.UNSUBSCRIBED;
            case 2:
                return SubscriptionState.RELEASES_ONLY;
            case 3:
                return SubscriptionState.SUBSCRIBED;
            case 4:
                return SubscriptionState.IGNORED;
            case 5:
                return SubscriptionState.CUSTOM;
            case 6:
                return SubscriptionState.UNKNOWN__;
        }
    }

    public static final yz0.w7 z0(ta0 ta0Var) {
        IssueOrPullRequestState issueOrPullRequestState;
        yz0.s bVar_r7;
        ua0 ua0Var;
        ra0 ra0Var;
        ua0 ua0Var2;
        ua0 ua0Var3;
        va0 va0Var;
        ua0 ua0Var4;
        ua0 ua0Var5;
        ua0 ua0Var6;
        ua0 ua0Var7;
        k71.k.g(ta0Var, "<this>");
        wa0 wa0Var = ta0Var.a;
        String str = "";
        String str2 = (wa0Var == null || (ua0Var7 = wa0Var.b) == null) ? "" : ua0Var7.b;
        bf bfVar = (wa0Var == null || (ua0Var6 = wa0Var.b) == null) ? null : ua0Var6.d;
        int i = bfVar == null ? -1 : bx0.o.a[bfVar.ordinal()];
        if (i == -1) {
            issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
        } else if (i == 1) {
            issueOrPullRequestState = IssueOrPullRequestState.ISSUE_OPEN;
        } else if (i == 2) {
            issueOrPullRequestState = IssueOrPullRequestState.ISSUE_CLOSED;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
        }
        ArrayList d = k21.f.d((wa0Var == null || (ua0Var5 = wa0Var.b) == null) ? null : ua0Var5.h);
        List f = b91.g.f((wa0Var == null || (ua0Var4 = wa0Var.b) == null) ? null : ua0Var4.i);
        kx0.g f2 = b31.b.f((wa0Var == null || (ua0Var3 = wa0Var.b) == null || (va0Var = ua0Var3.f) == null) ? null : va0Var.c);
        yp0.c cVar = (wa0Var == null || (ua0Var2 = wa0Var.b) == null) ? null : ua0Var2.j;
        if (cVar == null) {
            yz0.s.Companion.getClass();
            bVar_r7 = yz0.r.b;
        } else {
            yp0.c a2 = yp0.c.a(cVar, wa0Var.b.e, null, 4031);
            ua0 ua0Var8 = wa0Var.b;
            bVar_r7 = new kx0.b(a2, ua0Var8.c, new yz0.a0(ua0Var8.b));
        }
        if (wa0Var != null && (ra0Var = wa0Var.a) != null) {
            str = ra0Var.b;
        }
        return new yz0.w7(str2, issueOrPullRequestState, d, f, x61.r.r, f2, bVar_r7, new com.github.service.models.response.a(str, (Avatar) null, (String) null, false, (String) null, 62), new ArrayList(), (wa0Var == null || (ua0Var = wa0Var.b) == null || !ua0Var.g) ? false : true);
    }

    public Object A(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        k71.k.g(serialDescriptor, "descriptor");
        k71.k.g(kSerializer, "deserializer");
        return u(kSerializer);
    }

    public byte B() {
        Object U = U();
        k71.k.e(U, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) U).byteValue();
    }

    public short C() {
        Object U = U();
        k71.k.e(U, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) U).shortValue();
    }

    public float D() {
        Object U = U();
        k71.k.e(U, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) U).floatValue();
    }

    public double E() {
        Object U = U();
        k71.k.e(U, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) U).doubleValue();
    }

    public Object U() {
        throw new SerializationException(k71.x.a(getClass()) + " can't retrieve untyped values");
    }

    public j81.a b(SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "descriptor");
        return this;
    }

    public boolean c() {
        Object U = U();
        k71.k.e(U, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) U).booleanValue();
    }

    public char d() {
        Object U = U();
        k71.k.e(U, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) U).charValue();
    }

    public int e(SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "enumDescriptor");
        Object U = U();
        k71.k.e(U, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) U).intValue();
    }

    public long f(SerialDescriptor serialDescriptor, int i) {
        k71.k.g(serialDescriptor, "descriptor");
        return o();
    }

    public void g(SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "descriptor");
    }

    public float h(k81.g1 g1Var, int i) {
        k71.k.g(g1Var, "descriptor");
        return D();
    }

    public char i(k81.g1 g1Var, int i) {
        k71.k.g(g1Var, "descriptor");
        return d();
    }

    public short j(k81.g1 g1Var, int i) {
        k71.k.g(g1Var, "descriptor");
        return C();
    }

    public int l() {
        Object U = U();
        k71.k.e(U, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) U).intValue();
    }

    public int m(SerialDescriptor serialDescriptor, int i) {
        k71.k.g(serialDescriptor, "descriptor");
        return l();
    }

    public String n() {
        Object U = U();
        k71.k.e(U, "null cannot be cast to non-null type kotlin.String");
        return (String) U;
    }

    public long o() {
        Object U = U();
        k71.k.e(U, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) U).longValue();
    }

    public boolean p(SerialDescriptor serialDescriptor, int i) {
        k71.k.g(serialDescriptor, "descriptor");
        return c();
    }

    public Decoder q(k81.g1 g1Var, int i) {
        k71.k.g(g1Var, "descriptor");
        return y(g1Var.j(i));
    }

    public String r(SerialDescriptor serialDescriptor, int i) {
        k71.k.g(serialDescriptor, "descriptor");
        return n();
    }

    public boolean s() {
        return true;
    }

    public byte v(k81.g1 g1Var, int i) {
        k71.k.g(g1Var, "descriptor");
        return B();
    }

    public Object x(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        k71.k.g(serialDescriptor, "descriptor");
        k71.k.g(kSerializer, "deserializer");
        if (kSerializer.getDescriptor().c() || s()) {
            return u(kSerializer);
        }
        return null;
    }

    public Decoder y(SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "descriptor");
        return this;
    }

    public double z(SerialDescriptor serialDescriptor, int i) {
        k71.k.g(serialDescriptor, "descriptor");
        return E();
    }
}
