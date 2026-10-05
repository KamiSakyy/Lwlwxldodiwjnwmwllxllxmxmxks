package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.tooling.DiagnosticComposeException;
import androidx.compose.ui.res.ResourceResolutionException;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.issueorpullrequest.IssueTypeColor;
import com.github.service.models.response.projects.ProjectFieldType;
import com.github.service.models.response.shortcuts.ShortcutIcon;
import com.github.service.models.response.type.DiffLineType;
import com.github.service.models.response.type.PatchStatus;
import com.github.service.models.response.type.StatusState;
import gn0.pj;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kc0.fm;
import kc0.gm;
import kc0.hm;
import kc0.im;
import kc0.jm;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import m10.mj;
import m10.pt;
import m10.y60;
import org.xmlpull.v1.XmlPullParserException;
import pz0.gu;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class z3 implements a5.m1 {
    public static b51.d a;

    public static final i2.b C(int i, int i2, androidx.compose.runtime.s sVar) {
        TypedValue typedValue;
        boolean z;
        Context context = (Context) sVar.j(w2.j0.b);
        Resources resources = (Resources) sVar.j(w2.j0.c);
        b3.d dVar = (b3.d) sVar.j(w2.j0.e);
        synchronized (dVar) {
            typedValue = (TypedValue) dVar.a.b(i);
            z = true;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                x.w wVar = dVar.a;
                int d = wVar.d(i);
                Object[] objArr = ((x.l) wVar).c;
                Object obj = objArr[d];
                ((x.l) wVar).b[d] = i;
                objArr[d] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !t71.p.L(charSequence, ".xml")) {
            sVar.c0(-1771643000);
            Resources.Theme theme = context.getTheme();
            boolean f = sVar.f(charSequence);
            if ((((i2 & 14) ^ 6) <= 4 || !sVar.d(i)) && (i2 & 6) != 4) {
                z = false;
            }
            boolean f2 = f | z | sVar.f(theme);
            Object N = sVar.N();
            if (f2 || N == androidx.compose.runtime.n.a) {
                try {
                    Drawable drawable = resources.getDrawable(i, null);
                    k71.k.e(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    N = new d2.g(((BitmapDrawable) drawable).getBitmap());
                    sVar.n0(N);
                } catch (Exception e) {
                    throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e);
                }
            }
            i2.a aVar = new i2.a((d2.g) N);
            sVar.q(false);
            return aVar;
        }
        sVar.c0(-1771798434);
        Resources.Theme theme2 = context.getTheme();
        int i3 = typedValue.changingConfigurations;
        b3.c cVar = (b3.c) sVar.j(w2.j0.d);
        b3.b bVar = new b3.b(theme2, i);
        WeakReference weakReference = (WeakReference) cVar.a.get(bVar);
        b3.a aVar2 = weakReference != null ? (b3.a) weakReference.get() : null;
        if (aVar2 == null) {
            XmlResourceParser xml = resources.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!k71.k.b(xml.getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            aVar2 = d5.Q(theme2, resources, xml, i3);
            cVar.a.put(bVar, new WeakReference(aVar2));
        }
        j2.o0 i4 = j2.b.i(aVar2.a, sVar);
        sVar.q(false);
        return i4;
    }

    public static final Class E(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            k71.k.f(rawType, "getRawType(...)");
            return E(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            k71.k.f(upperBounds, "getUpperBounds(...)");
            Object L = x61.l.L(upperBounds);
            k71.k.f(L, "first(...)");
            return E((Type) L);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            k71.k.f(genericComponentType, "getGenericComponentType(...)");
            return E(genericComponentType);
        }
        throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + k71.x.a(type.getClass()));
    }

    public static final KSerializer F(b21.l lVar, Class cls, List list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        KSerializer d = k81.c1.d(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (d != null) {
            return d;
        }
        k71.e a2 = k71.x.a(cls);
        y61.e eVar = k81.j1.a;
        KSerializer kSerializer = (KSerializer) k81.j1.a.get(a2);
        if (kSerializer != null) {
            return kSerializer;
        }
        KSerializer a3 = lVar.a(a2, list);
        if (a3 != null) {
            return a3;
        }
        if (cls.isInterface()) {
            return new g81.b(k71.x.a(cls));
        }
        return null;
    }

    public static final a61.l0 G(y71.i iVar, j71.c cVar) {
        k71.k.g(iVar, "<this>");
        return new a61.l0(new y71.y(iVar, new di.e(3, (a71.c) null)), cVar, 2);
    }

    public static final KSerializer H(b21.l lVar, Type type, boolean z) {
        ArrayList arrayList;
        KSerializer H;
        KSerializer H2;
        r71.b bVar;
        int i = 0;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
                k71.k.f(upperBounds, "getUpperBounds(...)");
                genericComponentType = (Type) x61.l.L(upperBounds);
            }
            k71.k.d(genericComponentType);
            if (z) {
                H2 = b91.g.I(lVar, genericComponentType);
            } else {
                k71.k.g(lVar, "<this>");
                H2 = H(lVar, genericComponentType, false);
                if (H2 == null) {
                    return null;
                }
            }
            if (genericComponentType instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) genericComponentType).getRawType();
                k71.k.e(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
                bVar = k71.x.a((Class) rawType);
            } else {
                if (!(genericComponentType instanceof r71.b)) {
                    throw new IllegalStateException("unsupported type in GenericArray: " + k71.x.a(genericComponentType.getClass()));
                }
                bVar = (r71.b) genericComponentType;
            }
            k71.k.e(bVar, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            return new k81.k1(bVar, H2);
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
                return F(lVar, cls, x61.r.r);
            }
            Class<?> componentType = cls.getComponentType();
            k71.k.f(componentType, "getComponentType(...)");
            if (z) {
                H = b91.g.I(lVar, componentType);
            } else {
                k71.k.g(lVar, "<this>");
                H = H(lVar, componentType, false);
                if (H == null) {
                    return null;
                }
            }
            return new k81.k1(k71.x.a(componentType), H);
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                Type[] upperBounds2 = ((WildcardType) type).getUpperBounds();
                k71.k.f(upperBounds2, "getUpperBounds(...)");
                Object L = x61.l.L(upperBounds2);
                k71.k.f(L, "first(...)");
                return H(lVar, (Type) L, true);
            }
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + k71.x.a(type.getClass()));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType2 = parameterizedType.getRawType();
        k71.k.e(rawType2, "null cannot be cast to non-null type java.lang.Class<*>");
        Class cls2 = (Class) rawType2;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        k71.k.d(actualTypeArguments);
        if (z) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                k71.k.d(type2);
                arrayList.add(b91.g.I(lVar, type2));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                k71.k.d(type3);
                k71.k.g(lVar, "<this>");
                KSerializer H3 = H(lVar, type3, false);
                if (H3 == null) {
                    return null;
                }
                arrayList.add(H3);
            }
        }
        if (Set.class.isAssignableFrom(cls2)) {
            KSerializer kSerializer = (KSerializer) arrayList.get(0);
            k71.k.g(kSerializer, "elementSerializer");
            return new k81.d(kSerializer, 2);
        }
        if (List.class.isAssignableFrom(cls2) || Collection.class.isAssignableFrom(cls2)) {
            KSerializer kSerializer2 = (KSerializer) arrayList.get(0);
            k71.k.g(kSerializer2, "elementSerializer");
            return new k81.d(kSerializer2, 0);
        }
        if (Map.class.isAssignableFrom(cls2)) {
            return m71.a.c((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (Map.Entry.class.isAssignableFrom(cls2)) {
            KSerializer kSerializer3 = (KSerializer) arrayList.get(0);
            KSerializer kSerializer4 = (KSerializer) arrayList.get(1);
            k71.k.g(kSerializer3, "keySerializer");
            k71.k.g(kSerializer4, "valueSerializer");
            return new k81.u0(kSerializer3, kSerializer4, 0);
        }
        if (w61.k.class.isAssignableFrom(cls2)) {
            KSerializer kSerializer5 = (KSerializer) arrayList.get(0);
            KSerializer kSerializer6 = (KSerializer) arrayList.get(1);
            k71.k.g(kSerializer5, "keySerializer");
            k71.k.g(kSerializer6, "valueSerializer");
            return new k81.u0(kSerializer5, kSerializer6, 1);
        }
        if (w61.q.class.isAssignableFrom(cls2)) {
            KSerializer kSerializer7 = (KSerializer) arrayList.get(0);
            KSerializer kSerializer8 = (KSerializer) arrayList.get(1);
            KSerializer kSerializer9 = (KSerializer) arrayList.get(2);
            k71.k.g(kSerializer7, "aSerializer");
            k71.k.g(kSerializer8, "bSerializer");
            k71.k.g(kSerializer9, "cSerializer");
            return new k81.r1(kSerializer7, kSerializer8, kSerializer9);
        }
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            KSerializer kSerializer10 = (KSerializer) obj;
            k71.k.e(kSerializer10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            arrayList2.add(kSerializer10);
        }
        return F(lVar, cls2, arrayList2);
    }

    public static void I(TextView textView, int i) {
        sy.p.h(i);
        if (Build.VERSION.SDK_INT >= 28) {
            a5.l.y(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void J(TextView textView, int i) {
        sy.p.h(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void K(TextView textView, int i) {
        sy.p.h(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static final y60 L(ShortcutIcon shortcutIcon) {
        switch (shortcutIcon == null ? -1 : dz.q.a[shortcutIcon.ordinal()]) {
            case -1:
                return y60.m0;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return y60.l0;
            case 2:
                return y60.Q;
            case 3:
                return y60.L;
            case 4:
                return y60.E;
            case 5:
                return y60.W;
            case 6:
                return y60.X;
            case 7:
                return y60.x;
            case 8:
                return y60.I;
            case 9:
                return y60.C;
            case 10:
                return y60.B;
            case 11:
                return y60.D;
            case 12:
                return y60.F;
            case 13:
                return y60.j0;
            case 14:
                return y60.k0;
            case 15:
                return y60.v;
            case 16:
                return y60.t;
            case 17:
                return y60.H;
            case 18:
                return y60.i0;
            case 19:
                return y60.w;
            case 20:
                return y60.z;
            case 21:
                return y60.T;
            case 22:
                return y60.U;
            case 23:
                return y60.h0;
            case 24:
                return y60.J;
            case 25:
                return y60.M;
            case 26:
                return y60.y;
            case 27:
                return y60.V;
            case 28:
                return y60.d0;
            case 29:
                return y60.f0;
            case 30:
                return y60.O;
            case 31:
                return y60.G;
            case 32:
                return y60.A;
            case 33:
                return y60.S;
            case 34:
                return y60.e0;
            case 35:
                return y60.Y;
            case 36:
                return y60.u;
            case 37:
                return y60.K;
            case 38:
                return y60.N;
            case 39:
                return y60.P;
            case 40:
                return y60.R;
            case 41:
                return y60.Z;
            case 42:
                return y60.a0;
            case 43:
                return y60.b0;
            case 44:
                return y60.c0;
            case 45:
                return y60.g0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x013b, code lost:
    
        if (r4 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011f, code lost:
    
        if (r4 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0122, code lost:
    
        r31 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0159, code lost:
    
        if (r1.b == true) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0295 A[LOOP:3: B:150:0x0293->B:151:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c3 A[LOOP:1: B:88:0x01c1->B:89:0x01c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final yz0.u0 M(we0.b0 b0Var) {
        StatusState statusState;
        com.github.service.models.response.a aVar;
        String str;
        String str2;
        List list;
        int size;
        int i;
        List list2;
        int size2;
        int i2;
        List list3;
        int size3;
        int i3;
        List list4;
        int size4;
        int i4;
        int i5;
        IssueOrPullRequestState issueOrPullRequestState;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z;
        int size5;
        int i6;
        String str8;
        we0.h hVar;
        we0.p pVar;
        String str9;
        we0.g gVar;
        we0.o oVar;
        we0.x xVar;
        String str10;
        we0.y yVar;
        String str11;
        String str12;
        we0.a0 a0Var;
        k71.k.g(b0Var, "<this>");
        we0.b bVar = b0Var.k;
        we0.d dVar = b0Var.j;
        w61.p pVar2 = wz0.d.a;
        String str13 = wz0.d.c(b0Var.c, 6).a;
        String str14 = wz0.d.c(b0Var.b, 6).a;
        ZonedDateTime zonedDateTime = b0Var.a;
        String str15 = b0Var.d;
        String str16 = b0Var.e;
        String str17 = b0Var.h;
        we0.w wVar = b0Var.n;
        if (wVar == null || (statusState = sy.q.o(wVar.b)) == null) {
            statusState = StatusState.UNKNOWN__;
        }
        StatusState statusState2 = statusState;
        if (b0Var.g || b0Var.f) {
            aVar = null;
        } else {
            if (dVar == null || (a0Var = dVar.d) == null) {
                str11 = dVar != null ? dVar.c : null;
                if (str11 == null) {
                    str12 = "";
                    aVar = new com.github.service.models.response.a(str12, new Avatar(dVar == null ? dVar.b : "", dVar == null ? dVar.a : ""), (String) null, false, (String) null, 60);
                }
            } else {
                str11 = a0Var.a;
            }
            str12 = str11;
            aVar = new com.github.service.models.response.a(str12, new Avatar(dVar == null ? dVar.b : "", dVar == null ? dVar.a : ""), (String) null, false, (String) null, 60);
        }
        if (bVar == null || (yVar = bVar.d) == null) {
            str = bVar != null ? bVar.c : null;
            if (str == null) {
                str2 = "";
                com.github.service.models.response.a aVar2 = new com.github.service.models.response.a(str2, new Avatar(bVar == null ? bVar.b : "", bVar == null ? bVar.a : ""), (String) null, false, (String) null, 60);
                we0.e eVar = b0Var.m;
                int i7 = eVar == null ? eVar.a : 0;
                int i8 = eVar == null ? eVar.b : 0;
                int i9 = eVar == null ? eVar.c : 0;
                list = eVar == null ? eVar.d.a : null;
                x61.r rVar = x61.r.r;
                if (list == null) {
                    list = rVar;
                }
                ArrayList S = x61.m.S(list);
                ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                size = S.size();
                i = 0;
                while (i < size) {
                    Object obj = S.get(i);
                    int i10 = i + 1;
                    we0.j jVar = (we0.j) obj;
                    ArrayList arrayList2 = S;
                    we0.i iVar = jVar.d;
                    List list5 = jVar.e;
                    pj pjVar = jVar.i;
                    we0.n nVar = jVar.c;
                    int i12 = size;
                    String str18 = iVar != null ? iVar.a : null;
                    if (str18 == null || t71.p.T(str18)) {
                        String str19 = nVar != null ? nVar.a : null;
                        if (str19 != null) {
                            if (!t71.p.T(str19)) {
                                if (nVar != null) {
                                    str5 = nVar.a;
                                }
                            }
                        }
                        str6 = "";
                    } else {
                        if (iVar != null) {
                            str5 = iVar.a;
                        }
                        str6 = "";
                    }
                    String str20 = (nVar == null || (str10 = nVar.a) == null) ? "" : str10;
                    if (jVar.f || jVar.g) {
                        str7 = str13;
                    } else {
                        if (iVar != null) {
                            str7 = str13;
                        } else {
                            str7 = str13;
                        }
                        if (!jVar.h) {
                            int ordinal = pjVar.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 3) {
                                    if (ordinal != 5) {
                                        z = false;
                                        boolean z2 = jVar.f;
                                        boolean z3 = jVar.g;
                                        boolean z4 = jVar.h;
                                        boolean z5 = iVar != null ? iVar.b : false;
                                        String str21 = (iVar != null || (xVar = iVar.c) == null) ? "" : xVar.a;
                                        PatchStatus p = sy.e0.p(pjVar);
                                        if (list5 == null) {
                                            list5 = rVar;
                                        }
                                        ArrayList S2 = x61.m.S(list5);
                                        String str22 = str14;
                                        ArrayList arrayList3 = new ArrayList(x61.n.F(S2, 10));
                                        size5 = S2.size();
                                        i6 = 0;
                                        while (i6 < size5) {
                                            Object obj2 = S2.get(i6);
                                            i6++;
                                            arrayList3.add(b4.c(((we0.f) obj2).b, null));
                                            size5 = size5;
                                            S2 = S2;
                                        }
                                        if (iVar != null || (gVar = iVar.d) == null || (oVar = gVar.b) == null || (str9 = oVar.a) == null) {
                                            if (nVar != null || (hVar = nVar.b) == null || (pVar = hVar.b) == null) {
                                                str8 = null;
                                                arrayList.add(new yz0.s0(str6, str20, z, z2, z3, z4, z5, str21, p, arrayList3, str8));
                                                S = arrayList2;
                                                i = i10;
                                                str14 = str22;
                                                size = i12;
                                                str13 = str7;
                                            } else {
                                                str9 = pVar.a;
                                            }
                                        }
                                        str8 = str9;
                                        arrayList.add(new yz0.s0(str6, str20, z, z2, z3, z4, z5, str21, p, arrayList3, str8));
                                        S = arrayList2;
                                        i = i10;
                                        str14 = str22;
                                        size = i12;
                                        str13 = str7;
                                    }
                                }
                            }
                            if (list5 != null) {
                                z = list5.isEmpty();
                                boolean z22 = jVar.f;
                                boolean z32 = jVar.g;
                                boolean z42 = jVar.h;
                                if (iVar != null) {
                                }
                                if (iVar != null) {
                                }
                                PatchStatus p2 = sy.e0.p(pjVar);
                                if (list5 == null) {
                                }
                                ArrayList S22 = x61.m.S(list5);
                                String str222 = str14;
                                ArrayList arrayList32 = new ArrayList(x61.n.F(S22, 10));
                                size5 = S22.size();
                                i6 = 0;
                                while (i6 < size5) {
                                }
                                if (iVar != null) {
                                }
                                if (nVar != null) {
                                }
                                str8 = null;
                                arrayList.add(new yz0.s0(str6, str20, z, z22, z32, z42, z5, str21, p2, arrayList32, str8));
                                S = arrayList2;
                                i = i10;
                                str14 = str222;
                                size = i12;
                                str13 = str7;
                            }
                        }
                    }
                    z = true;
                    boolean z222 = jVar.f;
                    boolean z322 = jVar.g;
                    boolean z422 = jVar.h;
                    if (iVar != null) {
                    }
                    if (iVar != null) {
                    }
                    PatchStatus p22 = sy.e0.p(pjVar);
                    if (list5 == null) {
                    }
                    ArrayList S222 = x61.m.S(list5);
                    String str2222 = str14;
                    ArrayList arrayList322 = new ArrayList(x61.n.F(S222, 10));
                    size5 = S222.size();
                    i6 = 0;
                    while (i6 < size5) {
                    }
                    if (iVar != null) {
                    }
                    if (nVar != null) {
                    }
                    str8 = null;
                    arrayList.add(new yz0.s0(str6, str20, z, z222, z322, z422, z5, str21, p22, arrayList322, str8));
                    S = arrayList2;
                    i = i10;
                    str14 = str2222;
                    size = i12;
                    str13 = str7;
                }
                String str23 = str13;
                String str24 = str14;
                list2 = b0Var.l.a;
                if (list2 == null) {
                    list2 = rVar;
                }
                ArrayList S3 = x61.m.S(list2);
                ArrayList arrayList4 = new ArrayList(x61.n.F(S3, 10));
                size2 = S3.size();
                i2 = 0;
                while (i2 < size2) {
                    Object obj3 = S3.get(i2);
                    i2++;
                    we0.m mVar = (we0.m) obj3;
                    we0.z zVar = mVar.d;
                    if (zVar != null) {
                        str3 = zVar.a;
                    } else {
                        str3 = mVar.b;
                        if (str3 == null) {
                            str4 = "";
                            arrayList4.add(new com.github.service.models.response.a(str4, new Avatar(mVar.c, mVar.a), (String) null, false, (String) null, 60));
                            S3 = S3;
                        }
                    }
                    str4 = str3;
                    arrayList4.add(new com.github.service.models.response.a(str4, new Avatar(mVar.c, mVar.a), (String) null, false, (String) null, 60));
                    S3 = S3;
                }
                list3 = b0Var.p.a;
                if (list3 == null) {
                    list3 = rVar;
                }
                ArrayList S4 = x61.m.S(list3);
                ArrayList arrayList5 = new ArrayList(x61.n.F(S4, 10));
                size3 = S4.size();
                i3 = 0;
                while (i3 < size3) {
                    Object obj4 = S4.get(i3);
                    i3++;
                    we0.l lVar = (we0.l) obj4;
                    arrayList5.add(new yz0.r0(lVar.b, lVar.a));
                    S4 = S4;
                    arrayList4 = arrayList4;
                }
                ArrayList arrayList6 = arrayList4;
                we0.a aVar3 = b0Var.o;
                list4 = aVar3 == null ? aVar3.a : null;
                if (list4 == null) {
                    list4 = rVar;
                }
                ArrayList S5 = x61.m.S(list4);
                ArrayList arrayList7 = new ArrayList(x61.n.F(S5, 10));
                i4 = 0;
                for (size4 = S5.size(); i4 < size4; size4 = i5) {
                    Object obj5 = S5.get(i4);
                    i4++;
                    we0.k kVar = (we0.k) obj5;
                    ArrayList arrayList8 = S5;
                    String str25 = kVar.a;
                    we0.u uVar = kVar.f;
                    ArrayList arrayList9 = arrayList5;
                    int ordinal2 = kVar.b.ordinal();
                    if (ordinal2 != 0) {
                        i5 = size4;
                        if (ordinal2 == 1) {
                            issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_MERGED;
                        } else if (ordinal2 == 2) {
                            issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_OPEN;
                        } else {
                            if (ordinal2 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
                        }
                    } else {
                        i5 = size4;
                        issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_CLOSED;
                    }
                    arrayList7.add(new yz0.t0(str25, issueOrPullRequestState, kVar.c, kVar.d, kVar.e, uVar.a, new com.github.service.models.response.a(uVar.b.b, new Avatar("", ""), (String) null, false, (String) null, 60), kVar.g));
                    S5 = arrayList8;
                    arrayList5 = arrayList9;
                }
                we0.v vVar = b0Var.i;
                return new yz0.u0(str23, str24, zonedDateTime, str15, str16, str17, aVar2, aVar, i7, i8, i9, arrayList, statusState2, arrayList6, arrayList5, arrayList7, vVar.b.b, vVar.c);
            }
        } else {
            str = yVar.a;
        }
        str2 = str;
        com.github.service.models.response.a aVar22 = new com.github.service.models.response.a(str2, new Avatar(bVar == null ? bVar.b : "", bVar == null ? bVar.a : ""), (String) null, false, (String) null, 60);
        we0.e eVar2 = b0Var.m;
        if (eVar2 == null) {
        }
        if (eVar2 == null) {
        }
        if (eVar2 == null) {
        }
        if (eVar2 == null) {
        }
        x61.r rVar2 = x61.r.r;
        if (list == null) {
        }
        ArrayList S6 = x61.m.S(list);
        ArrayList arrayList10 = new ArrayList(x61.n.F(S6, 10));
        size = S6.size();
        i = 0;
        while (i < size) {
        }
        String str232 = str13;
        String str242 = str14;
        list2 = b0Var.l.a;
        if (list2 == null) {
        }
        ArrayList S32 = x61.m.S(list2);
        ArrayList arrayList42 = new ArrayList(x61.n.F(S32, 10));
        size2 = S32.size();
        i2 = 0;
        while (i2 < size2) {
        }
        list3 = b0Var.p.a;
        if (list3 == null) {
        }
        ArrayList S42 = x61.m.S(list3);
        ArrayList arrayList52 = new ArrayList(x61.n.F(S42, 10));
        size3 = S42.size();
        i3 = 0;
        while (i3 < size3) {
        }
        ArrayList arrayList62 = arrayList42;
        we0.a aVar32 = b0Var.o;
        if (aVar32 == null) {
        }
        if (list4 == null) {
        }
        ArrayList S52 = x61.m.S(list4);
        ArrayList arrayList72 = new ArrayList(x61.n.F(S52, 10));
        i4 = 0;
        while (i4 < size4) {
        }
        we0.v vVar2 = b0Var.i;
        return new yz0.u0(str232, str242, zonedDateTime, str15, str16, str17, aVar22, aVar, i7, i8, i9, arrayList10, statusState2, arrayList62, arrayList52, arrayList72, vVar2.b.b, vVar2.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if ((r2 instanceof n6.c) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final e6.p N(n6.g gVar, Context context) {
        if (Build.VERSION.SDK_INT < 31) {
            n6.g e = b6.h1.e(gVar, context);
            if (e instanceof n6.b) {
                return e6.p.s;
            }
            if (!(e instanceof n6.f)) {
                if (e instanceof n6.d) {
                    return e6.p.u;
                }
                if (!(e instanceof n6.c)) {
                    throw new IllegalStateException("After resolution, no other type should be present");
                }
                return e6.p.v;
            }
            return e6.p.t;
        }
    }

    public static final e6.y O(int i) {
        if (i == 0) {
            return e6.y.s;
        }
        if (i == 1) {
            return e6.y.t;
        }
        if (i == 2) {
            return e6.y.u;
        }
        throw new IllegalStateException(("unknown vertical alignment " + ((Object) i6.b.b(i))).toString());
    }

    public static final e6.q P(int i) {
        if (i == 0) {
            return e6.q.s;
        }
        if (i == 1) {
            return e6.q.t;
        }
        if (i == 2) {
            return e6.q.u;
        }
        throw new IllegalStateException(("unknown horizontal alignment " + ((Object) i6.a.b(i))).toString());
    }

    public static final PullRequestState Q(gu guVar) {
        int i = guVar == null ? -1 : jx0.j.a[guVar.ordinal()];
        if (i == -1) {
            return PullRequestState.UNKNOWN__;
        }
        if (i == 1) {
            return PullRequestState.CLOSED;
        }
        if (i == 2) {
            return PullRequestState.MERGED;
        }
        if (i == 3) {
            return PullRequestState.OPEN;
        }
        if (i == 4) {
            return PullRequestState.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ProjectFieldType R(pt ptVar) {
        switch (ptVar == null ? -1 : cz.a.a[ptVar.ordinal()]) {
            case -1:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return ProjectFieldType.UNKNOWN;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return ProjectFieldType.ASSIGNEES;
            case 2:
                return ProjectFieldType.DATE;
            case 3:
                return ProjectFieldType.ITERATION;
            case 4:
                return ProjectFieldType.LABELS;
            case 5:
                return ProjectFieldType.LINKED_PULL_REQUESTS;
            case 6:
                return ProjectFieldType.MILESTONE;
            case 7:
                return ProjectFieldType.NUMBER;
            case 8:
                return ProjectFieldType.REPOSITORY;
            case 9:
                return ProjectFieldType.REVIEWERS;
            case 10:
                return ProjectFieldType.SINGLE_SELECT;
            case 11:
                return ProjectFieldType.TEXT;
            case 12:
                return ProjectFieldType.TITLE;
            case 13:
                return ProjectFieldType.TRACKS;
        }
    }

    public static final DiffLineType S(hc0.g8 g8Var) {
        int ordinal = g8Var.ordinal();
        if (ordinal == 0) {
            return DiffLineType.ADDITION;
        }
        if (ordinal == 1) {
            return DiffLineType.CONTEXT;
        }
        if (ordinal == 2) {
            return DiffLineType.DELETION;
        }
        if (ordinal == 3) {
            return DiffLineType.HUNK;
        }
        if (ordinal == 4) {
            return DiffLineType.INJECTED_CONTEXT;
        }
        if (ordinal == 5) {
            return DiffLineType.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean T(Throwable th, j71.a aVar) {
        DiagnosticComposeException diagnosticComposeException;
        List h = sy.u.h(th);
        int size = h.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) h.get(i)) instanceof DiagnosticComposeException) {
                return false;
            }
        }
        try {
            androidx.compose.runtime.tooling.a aVar2 = (androidx.compose.runtime.tooling.a) aVar.a();
            if (aVar2 != null && !aVar2.a.isEmpty()) {
                z = true;
            }
            if (z) {
                k71.k.d(aVar2);
                diagnosticComposeException = new DiagnosticComposeException(aVar2);
            } else {
                diagnosticComposeException = null;
            }
        } catch (Throwable th2) {
            diagnosticComposeException = th2;
        }
        if (diagnosticComposeException != null) {
            sy.u.a(th, diagnosticComposeException);
        }
        return z;
    }

    public static ActionMode.Callback V(ActionMode.Callback callback) {
        return callback instanceof f5.i ? ((f5.i) callback).a : callback;
    }

    public static ActionMode.Callback W(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof f5.i) || callback == null) ? callback : new f5.i(callback, textView);
    }

    public static /* synthetic */ boolean X(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.play_billing.m0 m0Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(m0Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(m0Var) != obj && atomicReferenceFieldUpdater.get(m0Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static void Y(int i, int i2) {
        String v0;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                v0 = b4.v0("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
                    sb.append("negative size: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                v0 = b4.v0("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(v0);
        }
    }

    public static void Z(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? a0(i, "start index", i3) : (i2 < 0 || i2 > i3) ? a0(i2, "end index", i3) : b4.v0("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String a0(int i, String str, int i2) {
        if (i < 0) {
            return b4.v0("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return b4.v0("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static final long d(int i) {
        if (!(i > 0)) {
            k0.b.a("The span value should be higher than 0");
        }
        return i;
    }

    public static final mn.e e(g20.g gVar, String str) {
        g20.s1 s1Var;
        List list = x61.r.r;
        if (gVar == null) {
            return new mn.e(0, list, new x01.i(null, false, true));
        }
        g20.o oVar = gVar.b;
        x01.i iVar = new x01.i(oVar.c, oVar.a, true ^ oVar.b);
        List<g20.k> list2 = gVar.c;
        if (list2 != null) {
            list = new ArrayList();
            for (g20.k kVar : list2) {
                mn.a b = (kVar == null || (s1Var = kVar.c) == null) ? null : i20.a.b(s1Var, str);
                if (b != null) {
                    list.add(b);
                }
            }
        }
        return new mn.e(gVar.a, list, iVar);
    }

    public static final IssueType f(gt.a aVar) {
        k71.k.g(aVar, "<this>");
        String str = aVar.a;
        String str2 = aVar.b;
        mj mjVar = aVar.e;
        k71.k.g(mjVar, "<this>");
        int ordinal = mjVar.ordinal();
        return new IssueType(str, str2, aVar.c, aVar.d, ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 4 ? ordinal != 5 ? ordinal != 6 ? ordinal != 7 ? IssueTypeColor.UNKNOWN : IssueTypeColor.YELLOW : IssueTypeColor.RED : IssueTypeColor.PURPLE : IssueTypeColor.PINK : IssueTypeColor.GREEN : IssueTypeColor.GRAY : IssueTypeColor.BLUE);
    }

    public static final List g(ow0.q qVar) {
        List<ow0.s> list;
        Parcelable d;
        k71.k.g(qVar, "<this>");
        ow0.r rVar = qVar.a;
        ArrayList arrayList = null;
        if (rVar != null && (list = rVar.a) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (ow0.s sVar : list) {
                ur0.k0 k0Var = sVar.b;
                if (k0Var != null) {
                    d = bx0.c.b(k0Var, true);
                } else {
                    xt0.u1 u1Var = sVar.c;
                    d = u1Var != null ? bx0.c.d(u1Var, true) : null;
                }
                if (d != null) {
                    arrayList2.add(d);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? x61.r.r : arrayList;
    }

    public static final yz0.g4 h(ak0.f fVar) {
        ak0.c cVar;
        ak0.e eVar;
        List list;
        ak0.b bVar;
        boolean z = fVar.a;
        String str = fVar.c;
        String str2 = fVar.d;
        List list2 = fVar.h.a;
        return new yz0.g4(z, str, str2, (list2 == null || (cVar = (ak0.c) x61.m.W(list2)) == null || (eVar = cVar.a) == null || (list = eVar.a) == null || (bVar = (ak0.b) x61.m.f0(list)) == null) ? null : b4.a0(bVar.b), fVar.e, fVar.f, b4.l0(fVar.g));
    }

    public static final h01.p i(uu0.d6 d6Var) {
        uu0.c6 c6Var = d6Var.b;
        return new h01.p(c6Var.a, c6Var.b);
    }

    public static final e6.w l(Context context, z5.h hVar) {
        e6.x xVar;
        e6.o oVar;
        e6.v A = e6.w.A();
        if (hVar instanceof i6.i) {
            xVar = e6.x.u;
        } else if (hVar instanceof i6.k) {
            xVar = a.a.p(((i6.k) hVar).d) ? e6.x.B : e6.x.s;
        } else if (hVar instanceof i6.j) {
            xVar = a.a.p(((i6.j) hVar).d) ? e6.x.C : e6.x.t;
        } else if (hVar instanceof m6.a) {
            xVar = e6.x.v;
        } else if (hVar instanceof d6.b) {
            xVar = e6.x.x;
        } else if (hVar instanceof d6.a) {
            xVar = e6.x.w;
        } else if (hVar instanceof i6.l) {
            xVar = e6.x.y;
        } else if (hVar instanceof z5.i) {
            xVar = e6.x.A;
        } else if (hVar instanceof b6.p1) {
            xVar = e6.x.z;
        } else {
            if (!(hVar instanceof b6.z)) {
                throw new IllegalArgumentException("Unknown element type " + hVar.getClass().getCanonicalName());
            }
            xVar = e6.x.D;
        }
        A.c();
        e6.w.n(((androidx.glance.appwidget.protobuf.x) A).s, xVar);
        i6.s sVar = (i6.s) hVar.c().a(b6.g1.K, (Object) null);
        n6.g gVar = n6.f.a;
        e6.p N = N(sVar != null ? sVar.a : gVar, context);
        A.c();
        e6.w.o(((androidx.glance.appwidget.protobuf.x) A).s, N);
        i6.m mVar = (i6.m) hVar.c().a(b6.g1.L, (Object) null);
        if (mVar != null) {
            gVar = mVar.a;
        }
        e6.p N2 = N(gVar, context);
        A.c();
        e6.w.p(((androidx.glance.appwidget.protobuf.x) A).s, N2);
        int i = 0;
        boolean z = hVar.c().a(b6.g1.I, (Object) null) != null;
        A.c();
        e6.w.u(((androidx.glance.appwidget.protobuf.x) A).s, z);
        if (hVar.c().a(b6.g1.J, (Object) null) != null) {
            A.c();
            e6.w.t(((androidx.glance.appwidget.protobuf.x) A).s);
        }
        if (hVar instanceof z5.i) {
            z5.i iVar = (z5.i) hVar;
            int i2 = iVar.e;
            if (i2 == 1) {
                oVar = e6.o.s;
            } else if (i2 == 0) {
                oVar = e6.o.t;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException(("Unknown content scale " + ((Object) i6.h.a(iVar.e))).toString());
                }
                oVar = e6.o.u;
            }
            A.c();
            e6.w.s(((androidx.glance.appwidget.protobuf.x) A).s, oVar);
            boolean z2 = !sy.r.r(iVar);
            A.c();
            e6.w.w(((androidx.glance.appwidget.protobuf.x) A).s, z2);
            boolean z3 = iVar.c != null;
            A.c();
            e6.w.x(((androidx.glance.appwidget.protobuf.x) A).s, z3);
            boolean z4 = iVar.d != null;
            A.c();
            e6.w.y(((androidx.glance.appwidget.protobuf.x) A).s, z4);
        } else if (hVar instanceof i6.j) {
            e6.q P = P(((i6.j) hVar).f);
            A.c();
            e6.w.q(((androidx.glance.appwidget.protobuf.x) A).s, P);
        } else if (hVar instanceof i6.k) {
            e6.y O = O(((i6.k) hVar).f);
            A.c();
            e6.w.r(((androidx.glance.appwidget.protobuf.x) A).s, O);
        } else if (hVar instanceof i6.i) {
            i6.i iVar2 = (i6.i) hVar;
            e6.q P2 = P(iVar2.e.a);
            A.c();
            e6.w.q(((androidx.glance.appwidget.protobuf.x) A).s, P2);
            e6.y O2 = O(iVar2.e.b);
            A.c();
            e6.w.r(((androidx.glance.appwidget.protobuf.x) A).s, O2);
        } else if (hVar instanceof d6.a) {
            e6.q P3 = P(((d6.a) hVar).e);
            A.c();
            e6.w.q(((androidx.glance.appwidget.protobuf.x) A).s, P3);
        }
        if ((hVar instanceof z5.j) && !(hVar instanceof d6.a)) {
            ArrayList arrayList = ((z5.j) hVar).c;
            ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                arrayList2.add(l(context, (z5.h) obj));
            }
            A.c();
            e6.w.v(((androidx.glance.appwidget.protobuf.x) A).s, arrayList2);
        }
        return A.a();
    }

    public static final uf0.r m(fm fmVar) {
        jm jmVar;
        gm gmVar;
        hm hmVar;
        im imVar = fmVar.a;
        if (imVar == null || (jmVar = imVar.a) == null || (gmVar = jmVar.a) == null || (hmVar = gmVar.c) == null) {
            return null;
        }
        return hmVar.b;
    }

    public static final Object n(n5.f fVar, j71.e eVar, a71.c cVar) {
        return fVar.a(new b6.x(1, (a71.c) null, eVar), cVar);
    }

    public static final ArrayList o(androidx.compose.runtime.tooling.a aVar) {
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = aVar.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            androidx.compose.runtime.tooling.b bVar = (androidx.compose.runtime.tooling.b) list.get(i);
            if (!x61.l.s(iArr, bVar.a)) {
                if (bVar.a == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((androidx.compose.runtime.tooling.b) list.get(i3)).a == 1000) {
                        break;
                    }
                    x61.m.q0(arrayList);
                } else {
                    arrayList.add(bVar);
                }
            }
            i = i2;
        }
        return arrayList;
    }

    public static q81.m q(SSLSession sSLSession) {
        List list;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        q81.h c = q81.h.b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        q81.e0.s.getClass();
        q81.e0 d = q81.b.d(protocol);
        try {
            list = r81.g.k(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            list = x61.r.r;
        }
        return new q81.m(d, c, r81.g.k(sSLSession.getLocalCertificates()), new g81.f(3, list));
    }

    public static l61.f r(k.i iVar, androidx.lifecycle.o1 o1Var) {
        e51.a U0 = ((l61.a) k41.b.v(l61.a.class, iVar)).U0();
        p61.c cVar = (p61.c) U0.s;
        o1Var.getClass();
        return new l61.f(cVar, o1Var, (b1.m) U0.t);
    }

    public static l61.f s(androidx.fragment.app.a0 a0Var, androidx.lifecycle.o1 o1Var) {
        e51.a U0 = ((l61.b) k41.b.v(l61.b.class, a0Var)).c.U0();
        p61.c cVar = (p61.c) U0.s;
        o1Var.getClass();
        return new l61.f(cVar, o1Var, (b1.m) U0.t);
    }

    public static y4.c t(AppCompatTextView appCompatTextView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new y4.c(a5.l.q(appCompatTextView));
        }
        TextPaint textPaint = new TextPaint(appCompatTextView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = appCompatTextView.getBreakStrategy();
        int hyphenationFrequency = appCompatTextView.getHyphenationFrequency();
        if (appCompatTextView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (appCompatTextView.getInputType() & 15) != 3) {
                boolean z = appCompatTextView.getLayoutDirection() == 1;
                switch (appCompatTextView.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(a5.l.h(DecimalFormatSymbols.getInstance(appCompatTextView.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new y4.c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static final String w(int i) {
        return no.a.k("appWidgetLayout-", i);
    }

    public static final long x(float f, long j) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : d2.t.b(d2.t.d(j) * f, j);
    }

    public abstract void A(View view, int i, int i2);

    public abstract void B(View view, float f, float f2);

    public abstract z3 D(k71.e eVar, Object obj);

    public abstract boolean U(View view, int i);

    public void a() {
    }

    public void b() {
    }

    public abstract int j(View view, int i);

    public abstract int k(View view, int i);

    public abstract Object p(k71.e eVar);

    public int u(View view) {
        return 0;
    }

    public int v() {
        return 0;
    }

    public void y(View view, int i) {
    }

    public abstract void z(int i);

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class AppCompatTextView<T1,T2,T3,T4> {
        public AppCompatTextView() {
        }
    }
}
