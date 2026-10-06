package b41;

import a0.s0;
import a5.b1;
import a5.c1;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.lazy.layout.p0;
import androidx.compose.foundation.lazy.layout.t0;
import androidx.compose.foundation.lazy.layout.y1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.i3;
import androidx.compose.runtime.t;
import ar0.h0;
import ar0.k0;
import b6.r1;
import b6.s1;
import b6.t1;
import b6.v1;
import b6.w1;
import b6.x1;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.CheckConclusionState;
import com.github.service.models.response.Language;
import com.github.service.models.response.WorkflowState;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.github.service.models.response.type.IssueState;
import com.github.service.models.response.type.PullRequestReviewCommentState;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.measurement.internal.h2;
import d1.i1;
import h0.h1;
import hc0.j2;
import hc0.uu;
import hc0.w00;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import k3.q;
import k3.r;
import k3.z;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Encoder;
import l3.v;
import m10.s60;
import n0.c0;
import o0.x;
import pz0.f40;
import pz0.kt;
import sy.d0Shadow;
import t71.p;
import uu0.q0;
import v8.f0;
import v8.j0;
import v8.y;
import w2.g1;
import w21.o;
import w61.a0;
import x61.s;
import x71.w;
import yz0.m1;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static f a = null;
    public static boolean b = false;
    public static Method c = null;
    public static boolean d = false;
    public static Field e;

    public static final f0 A(int i) {
        if (i == 0) {
            return f0.r;
        }
        if (i == 1) {
            return f0.s;
        }
        throw new IllegalArgumentException(s0.i("Could not convert ", i, " to OutOfQuotaPolicy"));
    }

    public static final j0 B(int i) {
        if (i == 0) {
            return j0.r;
        }
        if (i == 1) {
            return j0.s;
        }
        if (i == 2) {
            return j0.t;
        }
        if (i == 3) {
            return j0.u;
        }
        if (i == 4) {
            return j0.v;
        }
        if (i == 5) {
            return j0.w;
        }
        throw new IllegalArgumentException(s0.i("Could not convert ", i, " to State"));
    }

    public static final boolean C(x xVar, float f) {
        xVar.l().getClass();
        return !(((xVar.q() ? -f : q(xVar)) > 0.0f ? 1 : ((xVar.q() ? -f : q(xVar)) == 0.0f ? 0 : -1)) > 0);
    }

    public static String D(String str, Object... objArr) {
        int indexOf;
        String sb;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e2) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String sb3 = sb2.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(sb3);
                    logger.log(level, valueOf.length() != 0 ? "Exception during lenientFormat for ".concat(valueOf) : new String("Exception during lenientFormat for "), (Throwable) e2);
                    String name2 = e2.getClass().getName();
                    StringBuilder sb4 = new StringBuilder(name2.length() + String.valueOf(sb3).length() + 9);
                    sb4.append("<");
                    sb4.append(sb3);
                    sb4.append(" threw ");
                    sb4.append(name2);
                    sb4.append(">");
                    sb = sb4.toString();
                }
            }
            objArr[i2] = sb;
        }
        StringBuilder sb5 = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i3)) != -1) {
            sb5.append((CharSequence) str, i3, indexOf);
            sb5.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb5.append((CharSequence) str, i3, str.length());
        if (i < objArr.length) {
            sb5.append(" [");
            sb5.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb5.append(", ");
                sb5.append(objArr[i4]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }

    public static final int E(y yVar) {
        k71.k.g(yVar, "networkType");
        int ordinal = yVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        if (Build.VERSION.SDK_INT >= 30 && yVar == y.w) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + yVar + " to int");
                    }
                }
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q81.c F(q81.n nVar) {
        int i;
        int i2;
        String str;
        int length;
        q81.n nVar2 = nVar;
        k71.k.g(nVar2, "headers");
        int size = nVar2.size();
        int i3 = 0;
        boolean z = true;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i4 = -1;
        int i5 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i6 = -1;
        int i7 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i3 < size) {
            String b2 = nVar2.b(i3);
            String e2 = nVar2.e(i3);
            if (b2.equalsIgnoreCase("Cache-Control")) {
                if (str2 == null) {
                    str2 = e2;
                    i = 0;
                    while (i < e2.length()) {
                        int length2 = e2.length();
                        int i8 = i;
                        while (true) {
                            if (i8 >= length2) {
                                i2 = size;
                                i8 = e2.length();
                                break;
                            }
                            i2 = size;
                            if (p.J("=,;", e2.charAt(i8))) {
                                break;
                            }
                            i8++;
                            size = i2;
                        }
                        String substring = e2.substring(i, i8);
                        k71.k.f(substring, "substring(...)");
                        String obj = p.t0(substring).toString();
                        if (i8 == e2.length() || e2.charAt(i8) == ',' || e2.charAt(i8) == ';') {
                            i = i8 + 1;
                            str = null;
                        } else {
                            int i9 = i8 + 1;
                            byte[] bArr = r81.e.a;
                            int length3 = e2.length();
                            while (true) {
                                if (i9 >= length3) {
                                    i9 = e2.length();
                                    break;
                                }
                                char charAt = e2.charAt(i9);
                                int i10 = length3;
                                if (charAt != ' ' && charAt != '\t') {
                                    break;
                                }
                                i9++;
                                length3 = i10;
                            }
                            if (i9 >= e2.length() || e2.charAt(i9) != '\"') {
                                int length4 = e2.length();
                                int i12 = i9;
                                while (true) {
                                    if (i12 >= length4) {
                                        length = e2.length();
                                        break;
                                    }
                                    int i13 = length4;
                                    int i14 = i12;
                                    if (p.J(",;", e2.charAt(i12))) {
                                        length = i14;
                                        break;
                                    }
                                    i12 = i14 + 1;
                                    length4 = i13;
                                }
                                String substring2 = e2.substring(i9, length);
                                k71.k.f(substring2, "substring(...)");
                                str = p.t0(substring2).toString();
                                i = length;
                            } else {
                                int i15 = i9 + 1;
                                int Q = p.Q(e2, '\"', i15, 4);
                                str = e2.substring(i15, Q);
                                k71.k.f(str, "substring(...)");
                                i = Q + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(obj)) {
                            z2 = true;
                        } else if ("no-store".equalsIgnoreCase(obj)) {
                            z3 = true;
                        } else if ("max-age".equalsIgnoreCase(obj)) {
                            i4 = r81.e.n(str, -1);
                        } else if ("s-maxage".equalsIgnoreCase(obj)) {
                            i5 = r81.e.n(str, -1);
                        } else if ("private".equalsIgnoreCase(obj)) {
                            z4 = true;
                        } else if ("public".equalsIgnoreCase(obj)) {
                            z5 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                            z6 = true;
                        } else if ("max-stale".equalsIgnoreCase(obj)) {
                            i6 = r81.e.n(str, Integer.MAX_VALUE);
                        } else if ("min-fresh".equalsIgnoreCase(obj)) {
                            i7 = r81.e.n(str, -1);
                        } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                            z7 = true;
                        } else if ("no-transform".equalsIgnoreCase(obj)) {
                            z8 = true;
                        } else if ("immutable".equalsIgnoreCase(obj)) {
                            z9 = true;
                        }
                        size = i2;
                    }
                    i3++;
                    nVar2 = nVar;
                    size = size;
                }
            } else if (!b2.equalsIgnoreCase("Pragma")) {
                i3++;
                nVar2 = nVar;
                size = size;
            }
            z = false;
            i = 0;
            while (i < e2.length()) {
            }
            i3++;
            nVar2 = nVar;
            size = size;
        }
        return new q81.c(z2, z3, i4, i5, z4, z5, z6, i6, i7, z7, z8, z9, !z ? null : str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e2, code lost:
    
        r0 = sy.f0.h(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e6, code lost:
    
        m7.y.t(r2, (java.lang.Throwable) null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r7.j G(v7.a aVar, String str) {
        long j;
        Map b2;
        y61.g gVar;
        k71.k.g(aVar, "connection");
        v7.c F0 = aVar.F0("PRAGMA table_info(`" + str + "`)");
        try {
            long j2 = 0;
            if (F0.B0()) {
                int g = y9.a.g(F0, "name");
                int g2 = y9.a.g(F0, "type");
                int g3 = y9.a.g(F0, "notnull");
                int g4 = y9.a.g(F0, "pk");
                int g5 = y9.a.g(F0, "dflt_value");
                y61.e eVar = new y61.e();
                while (true) {
                    String l0 = F0.l0(g);
                    j = j2;
                    eVar.put(l0, new r7.g((int) F0.getLong(g4), 2, l0, F0.l0(g2), F0.isNull(g5) ? null : F0.l0(g5), F0.getLong(g3) != j2));
                    if (!F0.B0()) {
                        break;
                    }
                    j2 = j;
                }
                b2 = eVar.b();
                m7.y.t(F0, (Throwable) null);
            } else {
                b2 = s.r;
                m7.y.t(F0, (Throwable) null);
                j = 0;
            }
            F0 = aVar.F0("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int g6 = y9.a.g(F0, "id");
                int g7 = y9.a.g(F0, "seq");
                int g8 = y9.a.g(F0, "table");
                int g9 = y9.a.g(F0, "on_delete");
                int g10 = y9.a.g(F0, "on_update");
                List t = a.a.t(F0);
                F0.reset();
                y61.g gVar2 = new y61.g();
                while (F0.B0()) {
                    if (F0.getLong(g7) == j) {
                        int i = (int) F0.getLong(g6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = g6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : t) {
                            int i3 = g7;
                            List list = t;
                            if (((r7.f) obj).r == i) {
                                arrayList3.add(obj);
                            }
                            g7 = i3;
                            t = list;
                        }
                        int i4 = g7;
                        List list2 = t;
                        int size = arrayList3.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj2 = arrayList3.get(i5);
                            i5++;
                            r7.f fVar = (r7.f) obj2;
                            arrayList.add(fVar.t);
                            arrayList2.add(fVar.u);
                            arrayList3 = arrayList3;
                        }
                        gVar2.add(new r7.h(F0.l0(g8), F0.l0(g9), F0.l0(g10), arrayList, arrayList2));
                        g6 = i2;
                        g7 = i4;
                        t = list2;
                    }
                }
                y61.g h = sy.f0.h(gVar2);
                m7.y.t(F0, (Throwable) null);
                F0 = aVar.F0("PRAGMA index_list(`" + str + "`)");
                try {
                    int g12 = y9.a.g(F0, "name");
                    int g13 = y9.a.g(F0, "origin");
                    int g14 = y9.a.g(F0, "unique");
                    if (g12 == -1 || g13 == -1 || g14 == -1) {
                        m7.y.t(F0, (Throwable) null);
                        gVar = null;
                    } else {
                        y61.g gVar3 = new y61.g();
                        while (true) {
                            if (!F0.B0()) {
                                break;
                            }
                            if ("c".equals(F0.l0(g13))) {
                                r7.i u = a.a.u(aVar, F0.l0(g12), F0.getLong(g14) == 1);
                                if (u == null) {
                                    m7.y.t(F0, (Throwable) null);
                                    gVar = null;
                                    break;
                                }
                                gVar3.add(u);
                            }
                        }
                    }
                    return new r7.j(str, b2, h, gVar);
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object H(e eVar, c71.c cVar) {
        f41.a aVar;
        int i;
        if (cVar instanceof f41.a) {
            aVar = (f41.a) cVar;
            int i2 = aVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.v = i2 - Integer.MIN_VALUE;
                Object obj = aVar.u;
                b71.a aVar2 = b71.a.r;
                i = aVar.v;
                if (i != 0) {
                    sy.y.j(obj);
                    o a2 = eVar.a();
                    k71.k.f(a2, "appUpdateInfo");
                    aVar.v = 1;
                    v71.l lVar = new v71.l(1, b4.T(aVar));
                    lVar.t();
                    lVar.v(new a2.d(7, f41.c.s));
                    if (!a2.i()) {
                        f41.d dVar = new f41.d(lVar, 0);
                        h2 h2Var = w21.h.a;
                        a2.d(h2Var, dVar);
                        a2.c(h2Var, new f41.d(lVar, 1));
                    } else if (a2.j()) {
                        lVar.i(a2.h());
                    } else {
                        Exception g = a2.g();
                        k71.k.d(g);
                        lVar.i(sy.y.d(g));
                    }
                    obj = lVar.s();
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                k71.k.f(obj, "runTask(appUpdateInfo)");
                return obj;
            }
        }
        aVar = new f41.a(cVar);
        Object obj2 = aVar.u;
        b71.a aVar22 = b71.a.r;
        i = aVar.v;
        if (i != 0) {
        }
        k71.k.f(obj2, "runTask(appUpdateInfo)");
        return obj2;
    }

    public static void I(EditorInfo editorInfo, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            a5.m.g(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i >= 30) {
            a5.m.g(editorInfo, charSequence);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = charSequence.length();
        if (i4 < 0 || i2 > length) {
            L(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            L(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            L(editorInfo, charSequence, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int min = Math.min(charSequence.length() - i2, i8 - Math.min(i4, (int) (i8 * 0.8d)));
        int min2 = Math.min(i4, i8 - min);
        int i9 = i4 - min2;
        if (Character.isLowSurrogate(charSequence.charAt(i9))) {
            i9++;
            min2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i2 + min) - 1))) {
            min--;
        }
        int i10 = min2 + i7;
        L(editorInfo, i7 != i6 ? TextUtils.concat(charSequence.subSequence(i9, i9 + min2), charSequence.subSequence(i2, min + i2)) : charSequence.subSequence(i9, i10 + min + i9), min2, i10);
    }

    public static final byte[] J(Set set) {
        k71.k.g(set, "triggers");
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    v8.e eVar = (v8.e) it.next();
                    objectOutputStream.writeUTF(eVar.a.toString());
                    objectOutputStream.writeBoolean(eVar.b);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                k71.k.f(byteArray, "toByteArray(...)");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static void K(EditorInfo editorInfo, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            c5.a.b(editorInfo, z);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
    }

    public static void L(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static final int M(j0 j0Var) {
        k71.k.g(j0Var, "state");
        int ordinal = j0Var.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return 5;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
        return i;
    }

    public static final s60 N(ShortcutColor shortcutColor) {
        switch (shortcutColor == null ? -1 : dz.o.a[shortcutColor.ordinal()]) {
            case -1:
                return s60.A;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return s60.u;
            case 2:
                return s60.t;
            case 3:
                return s60.v;
            case 4:
                return s60.w;
            case 5:
                return s60.z;
            case 6:
                return s60.x;
            case 7:
                return s60.y;
        }
    }

    public static final Avatar O(ud0.c cVar) {
        String str;
        String str2;
        String str3 = "";
        if (cVar == null || (str = cVar.b) == null) {
            str = "";
        }
        if (cVar != null && (str2 = cVar.a) != null) {
            str3 = str2;
        }
        return new Avatar(str, str3);
    }

    public static final CheckConclusionState P(uu uuVar) {
        int ordinal = uuVar.ordinal();
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

    public static final e9.i Q(byte[] bArr) {
        k71.k.g(bArr, "bytes");
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new e9.i((NetworkRequest) null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int readInt = objectInputStream.readInt();
                int[] iArr = new int[readInt];
                for (int i = 0; i < readInt; i++) {
                    iArr[i] = objectInputStream.readInt();
                }
                int readInt2 = objectInputStream.readInt();
                int[] iArr2 = new int[readInt2];
                for (int i2 = 0; i2 < readInt2; i2++) {
                    iArr2[i2] = objectInputStream.readInt();
                }
                e9.i a2 = e9.a.a(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return a2;
            } finally {
            }
        } finally {
        }
    }

    public static final yz0.j R(mj0.c cVar, boolean z) {
        mj0.b bVar = cVar.c;
        if (bVar != null) {
            String str = bVar.b;
            return new yz0.j(cVar.d.a, cVar.a, str, cVar.b, z);
        }
        throw new ApiFailure(ApiFailureType.RESPONSE_ERROR, "A Ref should contain a target Oid", null, null, null, null, null, 120);
    }

    public static final CheckConclusionState S(j2 j2Var) {
        switch (j2Var == null ? -1 : ab0.b.a[j2Var.ordinal()]) {
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

    public static final WorkflowState T(w00 w00Var) {
        int ordinal = w00Var.ordinal();
        if (ordinal == 0) {
            return WorkflowState.ACTIVE;
        }
        if (ordinal == 1) {
            return WorkflowState.DELETED;
        }
        if (ordinal == 2) {
            return WorkflowState.DISABLED_FORK;
        }
        if (ordinal == 3) {
            return WorkflowState.DISABLED_INACTIVITY;
        }
        if (ordinal == 4) {
            return WorkflowState.DISABLED_MANUALLY;
        }
        if (ordinal == 5) {
            return WorkflowState.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final PullRequestReviewCommentState U(kt ktVar) {
        int ordinal = ktVar.ordinal();
        if (ordinal == 0) {
            return PullRequestReviewCommentState.PENDING;
        }
        if (ordinal == 1) {
            return PullRequestReviewCommentState.SUBMITTED;
        }
        if (ordinal == 2) {
            return PullRequestReviewCommentState.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final kx0.f V(as0.a aVar) {
        return new kx0.f(aVar.c, aVar.b, aVar.d);
    }

    public static final void W(w wVar, f41.j jVar) {
        k71.k.g(wVar, "<this>");
        wVar.j(jVar);
    }

    public static int X(Object obj) {
        if (obj == null) {
            return 4;
        }
        if (obj instanceof String) {
            return i91.b.c((String) obj).length;
        }
        if (obj instanceof Boolean) {
            return 16;
        }
        if (obj instanceof Integer) {
            return 4;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return 8;
        }
        if (obj instanceof ea.c) {
            return i91.b.c(((ea.c) obj).a).length + 8;
        }
        int i = 0;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Iterator it = map.keySet().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                i2 += X(it.next());
            }
            int i3 = 16 + i2;
            Iterator it2 = map.values().iterator();
            while (it2.hasNext()) {
                i += X(it2.next());
            }
            return i3 + i;
        }
        if (obj instanceof List) {
            Iterator it3 = ((Iterable) obj).iterator();
            while (it3.hasNext()) {
                i += X(it3.next());
            }
            return 16 + i;
        }
        if (obj instanceof ha.b) {
            return i91.b.c(((ha.b) obj).a).length + 16;
        }
        throw new IllegalStateException(("Unknown field type in Record: '" + obj + '\'').toString());
    }

    public static void Y(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(no.a.k("at index ", i2));
            }
        }
    }

    public static z a(int i, k3.s sVar, int i2) {
        return new z(i, sVar, i2, new r(new q[0]));
    }

    /* JADX WARN: Type inference failed for: r1v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.util.ArrayList] */
    public static final void b(int i, long j, androidx.compose.runtime.s sVar, x1 x1Var, j71.e eVar) {
        Object n;
        Collection collection;
        androidx.compose.runtime.s sVar2 = sVar;
        x1 x1Var2 = x1Var;
        sVar2.e0(361732211);
        j71.e eVar2 = eVar;
        int i2 = i | (sVar.f(x1Var) ? 4 : 2) | (sVar2.e(j) ? 32 : 16) | (sVar2.h(eVar2) ? 256 : 128);
        if ((i2 & 147) == 146 && sVar2.C()) {
            sVar2.V();
        } else {
            if (x1Var2 instanceof w1) {
                collection = d0Shadow.n(new s3.h(j));
            } else {
                if (!(x1Var2 instanceof v1)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    sVar2.c0(291633998);
                    Bundle bundle = (Bundle) sVar2.j(b6.s.a);
                    boolean z = (i2 & 112) == 32;
                    Object N = sVar2.N();
                    if (z || N == androidx.compose.runtime.n.a) {
                        N = new r1(j);
                        sVar2.n0(N);
                    }
                    j71.a aVar = (j71.a) N;
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("appWidgetSizes");
                    if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                        int i3 = bundle.getInt("appWidgetMinHeight", 0);
                        int i4 = bundle.getInt("appWidgetMaxHeight", 0);
                        int i5 = bundle.getInt("appWidgetMinWidth", 0);
                        int i6 = bundle.getInt("appWidgetMaxWidth", 0);
                        n = (i3 == 0 || i4 == 0 || i5 == 0 || i6 == 0) ? d0Shadow.n(aVar.a()) : x61.l.r(new s3.h[]{new s3.h(m7.y.a(i5, i4)), new s3.h(m7.y.a(i6, i3))});
                    } else {
                        n = new ArrayList(x61.n.F(parcelableArrayList, 10));
                        int size = parcelableArrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj = parcelableArrayList.get(i7);
                            i7++;
                            SizeF sizeF = (SizeF) obj;
                            n.add(new s3.h(m7.y.a(sizeF.getWidth(), sizeF.getHeight())));
                        }
                    }
                    sVar2.q(false);
                    collection = n;
                } else {
                    sVar2.c0(291738344);
                    Bundle bundle2 = (Bundle) sVar2.j(b6.s.a);
                    int i8 = bundle2.getInt("appWidgetMinHeight", 0);
                    int i9 = bundle2.getInt("appWidgetMaxWidth", 0);
                    s3.h hVar = null;
                    s3.h hVar2 = (i8 == 0 || i9 == 0) ? null : new s3.h(m7.y.a(i9, i8));
                    int i10 = bundle2.getInt("appWidgetMaxHeight", 0);
                    int i12 = bundle2.getInt("appWidgetMinWidth", 0);
                    if (i10 != 0 && i12 != 0) {
                        hVar = new s3.h(m7.y.a(i12, i10));
                    }
                    ArrayList K = x61.l.K(new s3.h[]{hVar2, hVar});
                    boolean isEmpty = K.isEmpty();
                    Collection collection2 = K;
                    if (isEmpty) {
                        collection2 = d0Shadow.n(new s3.h(j));
                    }
                    sVar2 = sVar;
                    sVar2.q(false);
                    collection = collection2;
                }
            }
            List F0 = x61.m.F0(x61.m.J0(collection));
            ArrayList arrayList = new ArrayList(x61.n.F(F0, 10));
            Iterator it = F0.iterator();
            while (it.hasNext()) {
                d(((i2 << 3) & 112) | (i2 & 896), ((s3.h) it.next()).a, sVar2, x1Var2, eVar2);
                arrayList.add(a0.a);
                sVar2 = sVar;
                x1Var2 = x1Var;
                eVar2 = eVar;
            }
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new s1(i, j, x1Var, eVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0267, code lost:
    
        if (r49.g(false) != false) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0323  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(w1.r rVar, n0.z zVar, n0.e eVar, d2 d2Var, h1 h1Var, boolean z, f0.j jVar, androidx.compose.foundation.layout.k kVar, androidx.compose.foundation.layout.i iVar, j71.c cVar, androidx.compose.runtime.s sVar, int i, int i2) {
        int i3;
        int i4;
        n0.z zVar2;
        boolean z2;
        boolean f;
        Object oVar;
        n0.z zVar3;
        androidx.compose.foundation.lazy.layout.h1 h1Var2;
        boolean z3;
        boolean z4;
        r71.c cVar2;
        w1.r rVar2;
        sVar.e0(708740370);
        if ((i & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.f(zVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? sVar.f(eVar) : sVar.h(eVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= sVar.f(d2Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= sVar.g(false) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= sVar.g(true) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= sVar.f(h1Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= sVar.g(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= sVar.f(jVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= sVar.f(kVar) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (sVar.f(iVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= sVar.h(cVar) ? 32 : 16;
        }
        if (sVar.S(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            sVar.X();
            if ((i & 1) != 0 && !sVar.A()) {
                sVar.V();
            }
            sVar.r();
            int i5 = i3 >> 3;
            int i6 = i5 & 14;
            int i7 = i6 | (i4 & 112);
            f1 G = t.G(cVar, sVar);
            int i8 = i3;
            boolean z5 = (((i7 & 14) ^ 6) > 4 && sVar.f(zVar)) || (i7 & 6) == 4;
            Object N = sVar.N();
            androidx.compose.runtime.i iVar2 = androidx.compose.runtime.n.a;
            if (z5 || N == iVar2) {
                androidx.compose.runtime.i iVar3 = androidx.compose.runtime.i.v;
                N = new a81.i(0, 6, i3.class, t.r(iVar3, new i1(28, t.r(iVar3, new de.f(G, 9)), zVar)), "value", "getValue()Ljava/lang/Object;");
                sVar.n0(N);
            }
            r71.c cVar3 = (r71.c) N;
            int i9 = i6 | ((i8 >> 9) & 112);
            boolean z6 = ((((i9 & 14) ^ 6) > 4 && sVar.f(zVar)) || (i9 & 6) == 4) | ((((i9 & 112) ^ 48) > 32 && sVar.g(false)) || (i9 & 48) == 32);
            Object N2 = sVar.N();
            if (z6 || N2 == iVar2) {
                N2 = new c0(zVar);
                sVar.n0(N2);
            }
            androidx.compose.foundation.lazy.layout.h1 h1Var3 = (c0) N2;
            Object N3 = sVar.N();
            if (N3 == iVar2) {
                N3 = t.p(sVar);
                sVar.n0(N3);
            }
            v71.z zVar4 = (v71.z) N3;
            d2.y yVar = (d2.y) sVar.j(g1.g);
            t0 t0Var = !((Boolean) sVar.j(g1.v)).booleanValue() ? y1.a : null;
            int i10 = (i8 & 524272) | ((i4 << 18) & 3670016) | ((i8 >> 6) & 29360128);
            boolean z7 = ((((i10 & 896) ^ 384) > 256 && sVar.f(eVar)) || (i10 & 384) == 256) | ((((i10 & 112) ^ 48) > 32 && sVar.f(zVar)) || (i10 & 48) == 32) | ((((i10 & 7168) ^ 3072) > 2048 && sVar.f(d2Var)) || (i10 & 3072) == 2048);
            if (((57344 & i10) ^ 24576) <= 16384) {
            }
            if ((i10 & 24576) != 16384) {
                z2 = false;
                f = ((((i10 & 29360128) ^ 12582912) <= 8388608 && sVar.f(kVar)) || (i10 & 12582912) == 8388608) | z7 | z2 | ((((458752 & i10) ^ 196608) <= 131072 && sVar.g(true)) || (i10 & 196608) == 131072) | ((((i10 & 3670016) ^ 1572864) <= 1048576 && sVar.f(iVar)) || (i10 & 1572864) == 1048576) | sVar.f(yVar);
                Object N4 = sVar.N();
                if (!f || N4 == iVar2) {
                    zVar3 = zVar;
                    h1Var2 = h1Var3;
                    z3 = false;
                    z4 = true;
                    oVar = new n0.o(zVar3, d2Var, cVar3, eVar, kVar, iVar, zVar4, yVar, t0Var);
                    cVar2 = cVar3;
                    sVar.n0(oVar);
                } else {
                    oVar = N4;
                    h1Var2 = h1Var3;
                    cVar2 = cVar3;
                    z3 = false;
                    z4 = true;
                    zVar3 = zVar;
                }
                p0 p0Var = (p0) oVar;
                h0.b2 b2Var = h0.b2.r;
                if (z) {
                    sVar.c0(27577840);
                    sVar.q(z3);
                    rVar2 = w1.o.a;
                } else {
                    sVar.c0(27281635);
                    boolean z8 = (((i6 ^ 6) <= 4 || !sVar.f(zVar3)) && (i5 & 6) != 4) ? z3 : z4;
                    Object N5 = sVar.N();
                    if (z8 || N5 == iVar2) {
                        N5 = new n0.f(zVar3);
                        sVar.n0(N5);
                    }
                    rVar2 = androidx.compose.foundation.lazy.layout.p.m((n0.f) N5, zVar3.n, b2Var);
                    sVar.q(z3);
                }
                zVar2 = zVar3;
                androidx.compose.foundation.lazy.layout.p.a(cVar2, f0.o.x(androidx.compose.foundation.lazy.layout.p.n(rVar.f(zVar3.k).f(zVar3.l), cVar2, h1Var2, b2Var, z).f(rVar2).f(zVar3.m.k), zVar3, b2Var, jVar, z, h1Var, zVar3.f, (o0.i) null), zVar2.o, p0Var, sVar, 0);
            }
            z2 = true;
            f = ((((i10 & 29360128) ^ 12582912) <= 8388608 && sVar.f(kVar)) || (i10 & 12582912) == 8388608) | z7 | z2 | ((((458752 & i10) ^ 196608) <= 131072 && sVar.g(true)) || (i10 & 196608) == 131072) | ((((i10 & 3670016) ^ 1572864) <= 1048576 && sVar.f(iVar)) || (i10 & 1572864) == 1048576) | sVar.f(yVar);
            Object N42 = sVar.N();
            if (f) {
            }
            zVar3 = zVar;
            h1Var2 = h1Var3;
            z3 = false;
            z4 = true;
            oVar = new n0.o(zVar3, d2Var, cVar3, eVar, kVar, iVar, zVar4, yVar, t0Var);
            cVar2 = cVar3;
            sVar.n0(oVar);
            p0 p0Var2 = (p0) oVar;
            h0.b2 b2Var2 = h0.b2.r;
            if (z) {
            }
            zVar2 = zVar3;
            androidx.compose.foundation.lazy.layout.p.a(cVar2, f0.o.x(androidx.compose.foundation.lazy.layout.p.n(rVar.f(zVar3.k).f(zVar3.l), cVar2, h1Var2, b2Var2, z).f(rVar2).f(zVar3.m.k), zVar3, b2Var2, jVar, z, h1Var, zVar3.f, (o0.i) null), zVar2.o, p0Var2, sVar, 0);
        } else {
            zVar2 = zVar;
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.fileschanged.ui.b(rVar, zVar2, eVar, d2Var, h1Var, z, jVar, kVar, iVar, cVar, i, i2);
        }
    }

    public static final void d(int i, long j, androidx.compose.runtime.s sVar, x1 x1Var, j71.e eVar) {
        sVar.e0(-771692794);
        int i2 = (sVar.e(j) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? sVar.f(x1Var) : sVar.h(x1Var) ? 32 : 16;
        }
        if (((i2 | (sVar.h(eVar) ? 256 : 128)) & 147) == 146 && sVar.C()) {
            sVar.V();
        } else {
            t.a(z5.g.a.a(new s3.h(j)), r1.i.d(-367769018, new s1(eVar, j, x1Var), sVar), sVar, 56);
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new t1(i, j, x1Var, eVar);
        }
    }

    public static Object e(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final Object[] f(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        x61.l.B(0, i, 6, objArr, objArr2);
        x61.l.x(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] g(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        x61.l.B(0, i, 6, objArr, objArr2);
        x61.l.x(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] h(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        x61.l.B(0, i, 6, objArr, objArr2);
        x61.l.x(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final yz0.p i(e10.d dVar) {
        k71.k.g(dVar, "<this>");
        double d2 = dVar.e;
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
                d0Shadow.x();
                throw null;
            }
            wz0.e c2 = wz0.d.c((String) obj, 2);
            arrayList2.add(new m1(c2.b, c2.a, dVar.b + i));
            i = i3;
        }
        return new yz0.p(d2, dVar.b, dVar.c, dVar.d, arrayList2);
    }

    public static final b01.j j(ar0.a0Shadow a0Var) {
        k0 k0Var;
        gu0.c cVar = a0Var.l;
        com.github.service.models.response.a e2 = k41.b.e(a0Var.c.b.b);
        ar0.p0 p0Var = a0Var.k;
        h0 h0Var = p0Var.q;
        String str = (h0Var == null || (k0Var = h0Var.b) == null) ? "" : k0Var.a;
        b01.b d2 = b91.g.d(p0Var);
        String str2 = str;
        String str3 = a0Var.d;
        String str4 = a0Var.e;
        String str5 = p0Var.l;
        ArrayList o = m7.y.o(cVar, p0Var.b);
        boolean z = cVar.c;
        boolean z2 = a0Var.j;
        boolean z3 = a0Var.f == f40.w;
        boolean z4 = a0Var.g;
        boolean z5 = a0Var.h;
        gt0.a aVar = a0Var.m;
        return new b01.j(e2, str2, d2, str3, str4, str5, o, z, z2, z3, z4, z5, aVar.b, aVar.c);
    }

    public static final yz0.t1 k(e10.e eVar) {
        ArrayList arrayList = eVar.f;
        String str = eVar.d;
        e10.a aVar = eVar.a;
        Object obj = null;
        Language language = new Language(aVar != null ? aVar.c : "", aVar != null ? aVar.a : null);
        int i = eVar.c;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            e10.d dVar = (e10.d) obj2;
            yz0.p i3 = dVar.e > 0.0d ? i(dVar) : null;
            if (i3 != null) {
                arrayList2.add(i3);
            }
        }
        List x0 = x61.m.x0(arrayList2, 4);
        if (x0.isEmpty()) {
            List x02 = x61.m.x0(arrayList, 4);
            ArrayList arrayList3 = new ArrayList(x61.n.F(x02, 10));
            Iterator it = x02.iterator();
            while (it.hasNext()) {
                arrayList3.add(i((e10.d) it.next()));
            }
            x0 = arrayList3;
        }
        List x03 = x61.m.x0(arrayList, 16);
        ArrayList arrayList4 = new ArrayList(x61.n.F(x03, 10));
        Iterator it2 = x03.iterator();
        while (it2.hasNext()) {
            arrayList4.add(i((e10.d) it2.next()));
        }
        Iterator it3 = x61.m.x0(arrayList, 16).iterator();
        if (it3.hasNext()) {
            obj = it3.next();
            if (it3.hasNext()) {
                int i4 = ((e10.d) obj).c;
                do {
                    Object next = it3.next();
                    int i5 = ((e10.d) next).c;
                    if (i4 < i5) {
                        obj = next;
                        i4 = i5;
                    }
                } while (it3.hasNext());
            }
        }
        e10.d dVar2 = (e10.d) obj;
        int i6 = dVar2 != null ? dVar2.c : 0;
        String str2 = eVar.e;
        e10.c cVar = eVar.b;
        return new yz0.t1(cVar != null ? cVar.b : "", cVar != null ? cVar.c.b : "", cVar != null ? cVar.c.c : "", str2, str, language, i6, i, x0, arrayList4);
    }

    public static final h01.j l(uu0.p0 p0Var) {
        k71.k.g(p0Var, "<this>");
        String str = p0Var.a;
        String str2 = p0Var.b;
        int i = p0Var.d;
        CloseReason k0 = b4.k0(p0Var.f);
        IssueState i0 = m71.a.i0(p0Var.g);
        q0 q0Var = p0Var.e;
        return new h01.j(str, str2, p0Var.c, i, k0, i0, q0Var.c.b, q0Var.b);
    }

    public static final LinkedHashSet m(byte[] bArr) {
        ObjectInputStream objectInputStream;
        k71.k.g(bArr, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            try {
                int readInt = objectInputStream.readInt();
                for (int i = 0; i < readInt; i++) {
                    Uri parse = Uri.parse(objectInputStream.readUTF());
                    boolean readBoolean = objectInputStream.readBoolean();
                    k71.k.d(parse);
                    linkedHashSet.add(new v8.e(readBoolean, parse));
                }
                objectInputStream.close();
                byteArrayInputStream.close();
                return linkedHashSet;
            } finally {
            }
        } finally {
        }
    }

    public static final s5.b n() {
        return new s5.b(true);
    }

    public static boolean o(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = c1.a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = b1.d;
        b1 b1Var = (b1) view.getTag(2131363404);
        WeakReference weakReference = null;
        if (b1Var == null) {
            b1Var = new b1();
            b1Var.a = null;
            b1Var.b = null;
            b1Var.c = null;
            view.setTag(2131363404, b1Var);
        }
        WeakReference weakReference2 = b1Var.c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        b1Var.c = new WeakReference(keyEvent);
        if (b1Var.b == null) {
            b1Var.b = new SparseArray();
        }
        SparseArray sparseArray = b1Var.b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(2131363405)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean p(a5.p pVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z = false;
        if (pVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return pVar.r(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window2 = activity.getWindow();
                if (window2.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!b) {
                            try {
                                c = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            b = true;
                        }
                        Method method = c;
                        if (method != null) {
                            try {
                                Object invoke = method.invoke(actionBar, keyEvent);
                                if (invoke != null) {
                                    z = ((Boolean) invoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (z) {
                            return true;
                        }
                    }
                }
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window2.getDecorView();
                if (c1.d(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!d) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        e = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    d = true;
                }
                Field field = e;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                    if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                        return true;
                    }
                    window = dialog.getWindow();
                    if (!window.superDispatchKeyEvent(keyEvent)) {
                        return true;
                    }
                    View decorView2 = window.getDecorView();
                    if (c1.d(decorView2, keyEvent)) {
                        return true;
                    }
                    return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
                }
                onKeyListener = null;
                if (onKeyListener == null) {
                }
                window = dialog.getWindow();
                if (!window.superDispatchKeyEvent(keyEvent)) {
                }
            } else if ((view != null && c1.d(view, keyEvent)) || pVar.r(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static final float q(x xVar) {
        return xVar.l().e == h0.b2.s ? Float.intBitsToFloat((int) (xVar.p() >> 32)) : Float.intBitsToFloat((int) (xVar.p() & 4294967295L));
    }

    public static final KSerializer r(k81.b bVar, j81.a aVar, String str) {
        k71.k.g(bVar, "<this>");
        KSerializer a2 = bVar.a(aVar, str);
        if (a2 != null) {
            return a2;
        }
        k81.c1Shadow.m(str, bVar.c());
        throw null;
    }

    public static final KSerializer s(k81.b bVar, Encoder encoder, Object obj) {
        k71.k.g(bVar, "<this>");
        k71.k.g(obj, "value");
        KSerializer b2 = bVar.b(encoder, obj);
        if (b2 != null) {
            return b2;
        }
        k71.e a2 = k71.xShadow.a(obj.getClass());
        r71.b c2 = bVar.c();
        k71.k.g(c2, "baseClass");
        String c3 = a2.c();
        if (c3 == null) {
            c3 = String.valueOf(a2);
        }
        k81.c1Shadow.m(c3, c2);
        throw null;
    }

    public static final byte[] t(e9.i iVar) {
        int[] E0;
        int[] E02;
        k71.k.g(iVar, "requestCompat");
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequest = (NetworkRequest) iVar.a;
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                if (i >= 31) {
                    E0 = e9.h.b(networkRequest);
                } else {
                    int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < 10; i2++) {
                        int i3 = iArr[i2];
                        if (e9.a.d(networkRequest, i3)) {
                            arrayList.add(Integer.valueOf(i3));
                        }
                    }
                    E0 = x61.m.E0(arrayList);
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    E02 = e9.h.a(networkRequest);
                } else {
                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                    ArrayList arrayList2 = new ArrayList();
                    for (int i4 = 0; i4 < 30; i4++) {
                        int i5 = iArr2[i4];
                        if (e9.a.c(networkRequest, i5)) {
                            arrayList2.add(Integer.valueOf(i5));
                        }
                    }
                    E02 = x61.m.E0(arrayList2);
                }
                objectOutputStream.writeInt(E0.length);
                for (int i6 : E0) {
                    objectOutputStream.writeInt(i6);
                }
                objectOutputStream.writeInt(E02.length);
                for (int i7 : E02) {
                    objectOutputStream.writeInt(i7);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                k71.k.f(byteArray, "toByteArray(...)");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final g3.g u(v vVar) {
        g3.g gVar = vVar.a;
        long j = vVar.b;
        gVar.getClass();
        return gVar.e(g3.p0.f(j), g3.p0.e(j));
    }

    public static final g3.g v(v vVar, int i) {
        g3.g gVar = vVar.a;
        g3.g gVar2 = vVar.a;
        long j = vVar.b;
        int e2 = g3.p0.e(j);
        int e3 = g3.p0.e(j);
        int i2 = e3 + i;
        if (((i ^ i2) & (e3 ^ i2)) < 0) {
            i2 = gVar2.s.length();
        }
        return gVar.e(e2, Math.min(i2, gVar2.s.length()));
    }

    public static final g3.g w(v vVar, int i) {
        g3.g gVar = vVar.a;
        long j = vVar.b;
        int f = g3.p0.f(j);
        int i2 = f - i;
        if (((f ^ i2) & (i ^ f)) < 0) {
            i2 = 0;
        }
        return gVar.e(Math.max(0, i2), g3.p0.f(j));
    }

    public static final int x(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final v8.a y(int i) {
        if (i == 0) {
            return v8.a.r;
        }
        if (i == 1) {
            return v8.a.s;
        }
        throw new IllegalArgumentException(s0.i("Could not convert ", i, " to BackoffPolicy"));
    }

    public static final y z(int i) {
        if (i == 0) {
            return y.r;
        }
        if (i == 1) {
            return y.s;
        }
        if (i == 2) {
            return y.t;
        }
        if (i == 3) {
            return y.u;
        }
        if (i == 4) {
            return y.v;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new IllegalArgumentException(s0.i("Could not convert ", i, " to NetworkType"));
        }
        return y.w;
    }



}
