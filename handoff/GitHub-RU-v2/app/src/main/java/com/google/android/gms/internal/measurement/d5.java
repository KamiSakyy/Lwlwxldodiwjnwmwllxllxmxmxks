package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.datastore.core.DirectBootUsageException;
import com.github.domain.database.serialization.SerializableAssignee;
import com.github.domain.searchandfilter.filters.data.assignee.NoAssignee;
import com.github.service.models.response.CheckStatusState;
import com.github.service.models.response.DeploymentState;
import com.github.service.models.response.DeploymentStatusState;
import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.NotificationReasonState;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.TimelineItem$LinkedItemConnectorType;
import com.github.service.models.response.TrendingPeriod;
import com.github.service.models.response.discussions.type.DiscussionStateReason;
import com.github.service.models.response.projects.ProjectViewItemSortableValueType;
import com.github.service.models.response.shortcuts.ShortcutType;
import com.github.service.models.response.type.IssueState;
import com.github.service.models.response.type.MergeStateStatus;
import com.github.service.models.response.type.PullRequestMergeMethod;
import com.github.service.models.response.type.SubscriptionState;
import gn0.kw;
import gn0.u9;
import hc0.ff;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import m10.ac0;
import m10.da0;
import m10.mx;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import pz0.y10;
import pz0.zs;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d5 implements Encoder {
    public static final int A(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        int i = 1;
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            i = (i * 31) + (obj instanceof Bundle ? A((Bundle) obj) : obj instanceof Object[] ? Arrays.deepHashCode((Object[]) obj) : obj instanceof byte[] ? Arrays.hashCode((byte[]) obj) : obj instanceof short[] ? Arrays.hashCode((short[]) obj) : obj instanceof int[] ? Arrays.hashCode((int[]) obj) : obj instanceof long[] ? Arrays.hashCode((long[]) obj) : obj instanceof float[] ? Arrays.hashCode((float[]) obj) : obj instanceof double[] ? Arrays.hashCode((double[]) obj) : obj instanceof char[] ? Arrays.hashCode((char[]) obj) : obj instanceof boolean[] ? Arrays.hashCode((boolean[]) obj) : obj != null ? obj.hashCode() : 0);
        }
        return i;
    }

    public static final c00.g B(m7.w wVar, String[] strArr, j71.c cVar) {
        k71.k.g(wVar, "db");
        m7.g i = wVar.i();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        k71.k.g(strArr2, "tables");
        m7.m0 m0Var = i.b;
        m0Var.getClass();
        y61.g gVar = new y61.g();
        for (String str : strArr2) {
            LinkedHashMap linkedHashMap = m0Var.c;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            k71.k.f(lowerCase, "toLowerCase(...)");
            Set set = (Set) linkedHashMap.get(lowerCase);
            if (set != null) {
                gVar.addAll(set);
            } else {
                gVar.add(str);
            }
        }
        String[] strArr3 = (String[]) sy.f0.h(gVar).toArray(new String[0]);
        int length = strArr3.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str2 = strArr3[i2];
            LinkedHashMap linkedHashMap2 = m0Var.f;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            k71.k.f(lowerCase2, "toLowerCase(...)");
            Integer num = (Integer) linkedHashMap2.get(lowerCase2);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
            iArr[i2] = num.intValue();
        }
        w61.k kVar = new w61.k(strArr3, iArr);
        String[] strArr4 = (String[]) kVar.r;
        int[] iArr2 = (int[]) kVar.s;
        k71.k.g(strArr4, "resolvedTableNames");
        k71.k.g(iArr2, "tableIds");
        return new c00.g(y71.n1.g(new t00.f8(new m7.x(m0Var, iArr2, strArr4, (a71.c) null, 1)), -1), wVar, cVar, 14);
    }

    public static void M() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        stackTraceElement.getFileName();
        stackTraceElement.getLineNumber();
    }

    public static String N(Context context, int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return no.a.k("?", i);
        }
    }

    public static String O(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final b3.a Q(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i) {
        long j;
        int i2;
        j2.e eVar;
        int i3;
        int i4;
        int eventType;
        int i5;
        int i6;
        int i7;
        x61.r rVar;
        x61.r rVar2;
        int i8;
        int i9;
        int i10;
        androidx.compose.foundation.lazy.layout.o1 d;
        Shader shader;
        d2.p qVar;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser2);
        k2.a aVar = new k2.a(xmlResourceParser2);
        TypedArray h = q4.b.h(resources, theme, asAttributeSet, k2.b.a);
        aVar.b(h.getChangingConfigurations());
        boolean z = !q4.b.e(xmlResourceParser2, "autoMirrored") ? false : h.getBoolean(5, false);
        aVar.b(h.getChangingConfigurations());
        float a = aVar.a(h, "viewportWidth", 7, 0.0f);
        float a2 = aVar.a(h, "viewportHeight", 8, 0.0f);
        if (a <= 0.0f) {
            throw new XmlPullParserException(h.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (a2 <= 0.0f) {
            throw new XmlPullParserException(h.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        int i12 = 3;
        float dimension = h.getDimension(3, 0.0f);
        aVar.b(h.getChangingConfigurations());
        float dimension2 = h.getDimension(2, 0.0f);
        aVar.b(h.getChangingConfigurations());
        if (h.hasValue(1)) {
            TypedValue typedValue = new TypedValue();
            h.getValue(1, typedValue);
            if (typedValue.type == 2) {
                j = d2.t.k;
            } else {
                ColorStateList c = q4.b.c(h, xmlResourceParser2, theme);
                aVar.b(h.getChangingConfigurations());
                j = c != null ? d2.a0.c(c.getDefaultColor()) : d2.t.k;
            }
        } else {
            j = d2.t.k;
        }
        long j2 = j;
        int i13 = h.getInt(6, -1);
        aVar.b(h.getChangingConfigurations());
        if (i13 != -1) {
            if (i13 == 3) {
                i2 = 3;
            } else if (i13 != 5) {
                if (i13 != 9) {
                    switch (i13) {
                        case 14:
                            i2 = 13;
                            break;
                        case 15:
                            i2 = 14;
                            break;
                        case 16:
                            i2 = 12;
                            break;
                    }
                } else {
                    i2 = 9;
                }
            }
            float f = dimension / resources.getDisplayMetrics().density;
            float f2 = dimension2 / resources.getDisplayMetrics().density;
            h.recycle();
            i3 = 2;
            i4 = 1;
            eVar = new j2.e((String) null, f, f2, a, a2, j2, i2, z, 1);
            int i14 = 0;
            while (xmlResourceParser2.getEventType() != i4 && (xmlResourceParser2.getDepth() >= i4 || xmlResourceParser2.getEventType() != i12)) {
                XmlPullParser xmlPullParser = aVar.a;
                eventType = xmlPullParser.getEventType();
                ArrayList arrayList = eVar.i;
                if (eventType == i3) {
                    if (eventType == i12 && "group".equals(xmlPullParser.getName())) {
                        int i15 = i14 + 1;
                        int i16 = 0;
                        while (i16 < i15) {
                            if (eVar.k) {
                                t2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                            }
                            j2.d dVar = (j2.d) arrayList.remove(arrayList.size() - i4);
                            ((j2.d) no.a.g(i4, arrayList)).j.add(new j2.l0(dVar.a, dVar.b, dVar.c, dVar.d, dVar.e, dVar.f, dVar.g, dVar.h, dVar.i, dVar.j));
                            i16++;
                            i4 = 1;
                            i12 = 3;
                            i3 = 2;
                        }
                        i7 = i12;
                        i6 = i3;
                        i14 = 0;
                    } else {
                        i7 = i12;
                        i6 = i3;
                    }
                    i5 = i4;
                } else {
                    String name = xmlPullParser.getName();
                    if (name != null) {
                        int hashCode = name.hashCode();
                        x61.r rVar3 = x61.r.r;
                        h0.b1 b1Var = aVar.c;
                        if (hashCode != -1649314686) {
                            if (hashCode != 3433509) {
                                if (hashCode == 98629247 && name.equals("group")) {
                                    TypedArray h2 = q4.b.h(resources, theme, asAttributeSet, k2.b.b);
                                    aVar.b(h2.getChangingConfigurations());
                                    float a3 = aVar.a(h2, "rotation", 5, 0.0f);
                                    float f3 = h2.getFloat(1, 0.0f);
                                    aVar.b(h2.getChangingConfigurations());
                                    float f4 = h2.getFloat(2, 0.0f);
                                    aVar.b(h2.getChangingConfigurations());
                                    float a4 = aVar.a(h2, "scaleX", 3, 1.0f);
                                    float a5 = aVar.a(h2, "scaleY", 4, 1.0f);
                                    float a6 = aVar.a(h2, "translateX", 6, 0.0f);
                                    float a7 = aVar.a(h2, "translateY", 7, 0.0f);
                                    String string = h2.getString(0);
                                    aVar.b(h2.getChangingConfigurations());
                                    String str = string == null ? "" : string;
                                    h2.recycle();
                                    int i17 = j2.m0.a;
                                    if (eVar.k) {
                                        t2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    arrayList.add(new j2.d(str, a3, f3, f4, a4, a5, a6, a7, rVar3, 512));
                                }
                            } else if (name.equals("path")) {
                                TypedArray h3 = q4.b.h(resources, theme, asAttributeSet, k2.b.c);
                                aVar.b(h3.getChangingConfigurations());
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                    throw new IllegalArgumentException("No path data available");
                                }
                                String string2 = h3.getString(0);
                                aVar.b(h3.getChangingConfigurations());
                                String str2 = string2 == null ? "" : string2;
                                String string3 = h3.getString(2);
                                aVar.b(h3.getChangingConfigurations());
                                if (string3 == null) {
                                    int i18 = j2.m0.a;
                                    rVar2 = rVar3;
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    b1Var.b(string3, arrayList2);
                                    rVar2 = arrayList2;
                                }
                                androidx.compose.foundation.lazy.layout.o1 d2 = q4.b.d(h3, xmlPullParser, theme, "fillColor", 1);
                                aVar.b(h3.getChangingConfigurations());
                                float a8 = aVar.a(h3, "fillAlpha", 12, 1.0f);
                                int i19 = !q4.b.e(xmlPullParser, "strokeLineCap") ? -1 : h3.getInt(8, -1);
                                aVar.b(h3.getChangingConfigurations());
                                if (i19 != 0) {
                                    if (i19 == 1) {
                                        i8 = 1;
                                    } else if (i19 == 2) {
                                        i8 = 2;
                                    }
                                    i9 = q4.b.e(xmlPullParser, "strokeLineJoin") ? -1 : h3.getInt(9, -1);
                                    aVar.b(h3.getChangingConfigurations());
                                    if (i9 != 0) {
                                        if (i9 == 1) {
                                            i10 = 1;
                                        } else if (i9 == 2) {
                                            i10 = 2;
                                        }
                                        float a9 = aVar.a(h3, "strokeMiterLimit", 10, 4.0f);
                                        d = q4.b.d(h3, xmlPullParser, theme, "strokeColor", 3);
                                        aVar.b(h3.getChangingConfigurations());
                                        float a10 = aVar.a(h3, "strokeAlpha", 11, 1.0f);
                                        float a12 = aVar.a(h3, "strokeWidth", 4, 1.0f);
                                        float a13 = aVar.a(h3, "trimPathEnd", 6, 1.0f);
                                        float a14 = aVar.a(h3, "trimPathOffset", 7, 0.0f);
                                        float a15 = aVar.a(h3, "trimPathStart", 5, 0.0f);
                                        int i20 = !q4.b.e(xmlPullParser, "fillType") ? 0 : h3.getInt(13, 0);
                                        aVar.b(h3.getChangingConfigurations());
                                        h3.recycle();
                                        Shader shader2 = (Shader) d2.c;
                                        d2.p qVar2 = (shader2 == null && d2.b == 0) ? null : shader2 != null ? new d2.q(shader2) : new d2.r0(d2.a0.c(d2.b));
                                        shader = (Shader) d.c;
                                        if (shader == null && d.b == 0) {
                                            qVar = null;
                                        } else {
                                            qVar = shader == null ? new d2.q(shader) : new d2.r0(d2.a0.c(d.b));
                                        }
                                        int i22 = i20 == 0 ? 0 : 1;
                                        if (eVar.k) {
                                            t2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                        }
                                        ((j2.d) no.a.g(1, arrayList)).j.add(new j2.s0(str2, rVar2, i22, qVar2, a8, qVar, a10, a12, i8, i10, a9, a15, a13, a14));
                                        i5 = 1;
                                        i7 = 3;
                                        i6 = 2;
                                    }
                                    i10 = 0;
                                    float a92 = aVar.a(h3, "strokeMiterLimit", 10, 4.0f);
                                    d = q4.b.d(h3, xmlPullParser, theme, "strokeColor", 3);
                                    aVar.b(h3.getChangingConfigurations());
                                    float a102 = aVar.a(h3, "strokeAlpha", 11, 1.0f);
                                    float a122 = aVar.a(h3, "strokeWidth", 4, 1.0f);
                                    float a132 = aVar.a(h3, "trimPathEnd", 6, 1.0f);
                                    float a142 = aVar.a(h3, "trimPathOffset", 7, 0.0f);
                                    float a152 = aVar.a(h3, "trimPathStart", 5, 0.0f);
                                    if (!q4.b.e(xmlPullParser, "fillType")) {
                                    }
                                    aVar.b(h3.getChangingConfigurations());
                                    h3.recycle();
                                    Shader shader22 = (Shader) d2.c;
                                    if (shader22 == null) {
                                        shader = (Shader) d.c;
                                        if (shader == null) {
                                            qVar = null;
                                            if (i20 == 0) {
                                            }
                                            if (eVar.k) {
                                            }
                                            ((j2.d) no.a.g(1, arrayList)).j.add(new j2.s0(str2, rVar2, i22, qVar2, a8, qVar, a102, a122, i8, i10, a92, a152, a132, a142));
                                            i5 = 1;
                                            i7 = 3;
                                            i6 = 2;
                                        }
                                        qVar = shader == null ? new d2.q(shader) : new d2.r0(d2.a0.c(d.b));
                                        if (i20 == 0) {
                                        }
                                        if (eVar.k) {
                                        }
                                        ((j2.d) no.a.g(1, arrayList)).j.add(new j2.s0(str2, rVar2, i22, qVar2, a8, qVar, a102, a122, i8, i10, a92, a152, a132, a142));
                                        i5 = 1;
                                        i7 = 3;
                                        i6 = 2;
                                    }
                                    shader = (Shader) d.c;
                                    if (shader == null) {
                                    }
                                    qVar = shader == null ? new d2.q(shader) : new d2.r0(d2.a0.c(d.b));
                                    if (i20 == 0) {
                                    }
                                    if (eVar.k) {
                                    }
                                    ((j2.d) no.a.g(1, arrayList)).j.add(new j2.s0(str2, rVar2, i22, qVar2, a8, qVar, a102, a122, i8, i10, a92, a152, a132, a142));
                                    i5 = 1;
                                    i7 = 3;
                                    i6 = 2;
                                }
                                i8 = 0;
                                if (q4.b.e(xmlPullParser, "strokeLineJoin")) {
                                }
                                aVar.b(h3.getChangingConfigurations());
                                if (i9 != 0) {
                                }
                                i10 = 0;
                                float a922 = aVar.a(h3, "strokeMiterLimit", 10, 4.0f);
                                d = q4.b.d(h3, xmlPullParser, theme, "strokeColor", 3);
                                aVar.b(h3.getChangingConfigurations());
                                float a1022 = aVar.a(h3, "strokeAlpha", 11, 1.0f);
                                float a1222 = aVar.a(h3, "strokeWidth", 4, 1.0f);
                                float a1322 = aVar.a(h3, "trimPathEnd", 6, 1.0f);
                                float a1422 = aVar.a(h3, "trimPathOffset", 7, 0.0f);
                                float a1522 = aVar.a(h3, "trimPathStart", 5, 0.0f);
                                if (!q4.b.e(xmlPullParser, "fillType")) {
                                }
                                aVar.b(h3.getChangingConfigurations());
                                h3.recycle();
                                Shader shader222 = (Shader) d2.c;
                                if (shader222 == null) {
                                }
                                shader = (Shader) d.c;
                                if (shader == null) {
                                }
                                qVar = shader == null ? new d2.q(shader) : new d2.r0(d2.a0.c(d.b));
                                if (i20 == 0) {
                                }
                                if (eVar.k) {
                                }
                                ((j2.d) no.a.g(1, arrayList)).j.add(new j2.s0(str2, rVar2, i22, qVar2, a8, qVar, a1022, a1222, i8, i10, a922, a1522, a1322, a1422));
                                i5 = 1;
                                i7 = 3;
                                i6 = 2;
                            }
                            i5 = 1;
                            i7 = 3;
                            i6 = 2;
                        } else {
                            i7 = 3;
                            i6 = 2;
                            if (name.equals("clip-path")) {
                                TypedArray h4 = q4.b.h(resources, theme, asAttributeSet, k2.b.d);
                                aVar.b(h4.getChangingConfigurations());
                                String string4 = h4.getString(0);
                                aVar.b(h4.getChangingConfigurations());
                                String str3 = string4 == null ? "" : string4;
                                i5 = 1;
                                String string5 = h4.getString(1);
                                aVar.b(h4.getChangingConfigurations());
                                if (string5 == null) {
                                    int i23 = j2.m0.a;
                                    rVar = rVar3;
                                } else {
                                    ArrayList arrayList3 = new ArrayList();
                                    b1Var.b(string5, arrayList3);
                                    rVar = arrayList3;
                                }
                                h4.recycle();
                                if (eVar.k) {
                                    t2.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                arrayList.add(new j2.d(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, rVar, 512));
                                i14++;
                            } else {
                                i5 = 1;
                            }
                        }
                    }
                    i5 = 1;
                    i7 = 3;
                    i6 = 2;
                }
                xmlResourceParser.next();
                xmlResourceParser2 = xmlResourceParser;
                i4 = i5;
                i12 = i7;
                i3 = i6;
            }
            return new b3.a(eVar.b(), i | aVar.b);
        }
        i2 = 5;
        float f5 = dimension / resources.getDisplayMetrics().density;
        float f22 = dimension2 / resources.getDisplayMetrics().density;
        h.recycle();
        i3 = 2;
        i4 = 1;
        eVar = new j2.e((String) null, f5, f22, a, a2, j2, i2, z, 1);
        int i142 = 0;
        while (xmlResourceParser2.getEventType() != i4) {
            XmlPullParser xmlPullParser2 = aVar.a;
            eventType = xmlPullParser2.getEventType();
            ArrayList arrayList4 = eVar.i;
            if (eventType == i3) {
            }
            xmlResourceParser.next();
            xmlResourceParser2 = xmlResourceParser;
            i4 = i5;
            i12 = i7;
            i3 = i6;
        }
        return new b3.a(eVar.b(), i | aVar.b);
    }

    public static final gl.f R(y71.i iVar) {
        k71.k.g(iVar, "<this>");
        return new gl.f(iVar, 7);
    }

    public static final yz0.f U(yz0.f fVar) {
        NoAssignee noAssignee = fVar instanceof NoAssignee ? (NoAssignee) fVar : null;
        return noAssignee != null ? noAssignee : new SerializableAssignee(fVar.d(), fVar.e(), fVar.getId(), fVar.getName(), fVar.q(), fVar.s(), fVar.u());
    }

    public static final ac0 Y(TrendingPeriod trendingPeriod) {
        int i = trendingPeriod == null ? -1 : dz.s.a[trendingPeriod.ordinal()];
        if (i == -1) {
            return ac0.v;
        }
        if (i == 1) {
            return ac0.s;
        }
        if (i == 2) {
            return ac0.t;
        }
        if (i == 3) {
            return ac0.u;
        }
        if (i == 4) {
            return ac0.v;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final y10 Z(ShortcutType shortcutType) {
        int i = shortcutType == null ? -1 : jx0.o.a[shortcutType.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return y10.u;
            }
            if (i == 2) {
                return y10.v;
            }
            if (i == 3) {
                return y10.t;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return y10.w;
    }

    public static final CheckStatusState a0(da0 da0Var) {
        int ordinal = da0Var.ordinal();
        if (ordinal == 0) {
            return CheckStatusState.COMPLETED;
        }
        if (ordinal == 1) {
            return CheckStatusState.UNKNOWN__;
        }
        if (ordinal == 2) {
            return CheckStatusState.COMPLETED;
        }
        if (ordinal == 3) {
            return CheckStatusState.QUEUED;
        }
        if (ordinal == 4) {
            return CheckStatusState.COMPLETED;
        }
        if (ordinal == 5) {
            return CheckStatusState.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v8, types: [x61.r] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List] */
    public static final yz0.y1 b0(mg0.m mVar) {
        kw kwVar;
        String str;
        int i;
        String str2;
        ?? r2;
        SubscriptionState subscriptionState;
        k71.k.g(mVar, "<this>");
        mg0.g gVar = mVar.m;
        kw kwVar2 = mVar.k;
        mg0.l lVar = mVar.j;
        kw kwVar3 = lVar.d;
        String str3 = mVar.b;
        String str4 = mVar.c;
        String str5 = mVar.d;
        Boolean bool = mVar.g;
        boolean z = true;
        if (bool == null || bool.booleanValue()) {
            z = false;
        }
        int i2 = mVar.h.a;
        boolean z2 = false;
        ZonedDateTime zonedDateTime = mVar.f;
        yz0.d3 d3Var = new yz0.d3(lVar.f.b, lVar.b);
        SubscriptionState z3 = sy.r.z(kwVar3);
        SubscriptionState z4 = sy.r.z(kwVar2);
        List list = lVar.e;
        SubscriptionState subscriptionState2 = SubscriptionState.IGNORED;
        if (z4 == subscriptionState2 || z3 == subscriptionState2 || (z3 == null && z4 == null)) {
            kwVar = kwVar2;
        } else {
            SubscriptionState subscriptionState3 = SubscriptionState.UNSUBSCRIBED;
            if (z3 == subscriptionState3 && z4 == subscriptionState3) {
                kwVar = kwVar2;
            } else {
                kwVar = kwVar2;
                SubscriptionState subscriptionState4 = SubscriptionState.CUSTOM;
                if (z3 != subscriptionState4 || z4 != subscriptionState3) {
                    if (z3 != subscriptionState4 || z4 != subscriptionState4) {
                        z2 = true;
                    } else if (list != null) {
                        z2 = list.contains(gn0.j6.u);
                    }
                }
            }
            z2 = false;
        }
        SubscriptionState z5 = sy.r.z(kwVar3);
        SubscriptionState z6 = sy.r.z(kwVar);
        SubscriptionState subscriptionState5 = (z6 == subscriptionState2 || z5 == SubscriptionState.SUBSCRIBED || z6 == (subscriptionState = SubscriptionState.UNSUBSCRIBED)) ? subscriptionState2 : subscriptionState;
        SubscriptionState z7 = sy.r.z(kwVar3);
        SubscriptionState z8 = sy.r.z(kwVar);
        SubscriptionState subscriptionState6 = SubscriptionState.SUBSCRIBED;
        if (z7 == subscriptionState6 && z8 == null) {
            subscriptionState6 = null;
        }
        SubscriptionState subscriptionState7 = subscriptionState6;
        List f = com.google.common.util.concurrent.a.f(mVar.p);
        String str6 = mVar.l;
        int i3 = mVar.e;
        IssueState n = sy.a0.n(mVar.i);
        List list2 = gVar.b;
        if (list2 != null) {
            ArrayList S = x61.m.S(list2);
            str = str6;
            i = i3;
            r2 = new ArrayList(x61.n.F(S, 10));
            str2 = str3;
            int i4 = 0;
            for (int size = S.size(); i4 < size; size = size) {
                Object obj = S.get(i4);
                i4++;
                r2.add(aa1.b.d(((mg0.j) obj).c));
            }
        } else {
            str = str6;
            i = i3;
            str2 = str3;
            r2 = x61.r.r;
        }
        com.github.rudroid.common.b0 b0Var = new com.github.rudroid.common.b0(gVar.a, (List) r2);
        mg0.h hVar = mVar.n;
        return new yz0.y1(str2, str4, str5, z, zonedDateTime, d3Var, z2, subscriptionState5, subscriptionState7, f, str, i, b0Var, i2, n, hVar != null ? hVar.a : 0, b31.b.d0(mVar.o), null, null, null, lVar.c, null);
    }

    public static final i01.a c0(ss0.m mVar) {
        PullRequestMergeMethod pullRequestMergeMethod;
        zs zsVar;
        String str = mVar.a;
        ss0.l lVar = mVar.b;
        int i = lVar != null ? lVar.a : 0;
        ss0.k kVar = mVar.c;
        if (kVar == null || (zsVar = kVar.a) == null || (pullRequestMergeMethod = aa1.b.V(zsVar)) == null) {
            pullRequestMergeMethod = PullRequestMergeMethod.UNKNOWN__;
        }
        return new i01.a(str, i, pullRequestMergeMethod, mVar.d);
    }

    public static final CheckStatusState d0(m10.b4 b4Var) {
        k71.k.g(b4Var, "<this>");
        switch (b4Var.ordinal()) {
            case 0:
                return CheckStatusState.COMPLETED;
            case 1:
                return CheckStatusState.IN_PROGRESS;
            case 2:
                return CheckStatusState.UNKNOWN__;
            case 3:
                return CheckStatusState.QUEUED;
            case 4:
                return CheckStatusState.REQUESTED;
            case 5:
                return CheckStatusState.WAITING;
            case 6:
                return CheckStatusState.UNKNOWN__;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final DiscussionStateReason e0(u9 u9Var) {
        k71.k.g(u9Var, "<this>");
        int ordinal = u9Var.ordinal();
        if (ordinal == 0) {
            return DiscussionStateReason.DUPLICATE;
        }
        if (ordinal == 1) {
            return DiscussionStateReason.OUTDATED;
        }
        if (ordinal == 2) {
            return DiscussionStateReason.REOPENED;
        }
        if (ordinal == 3) {
            return DiscussionStateReason.RESOLVED;
        }
        if (ordinal == 4) {
            return DiscussionStateReason.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ProjectViewItemSortableValueType f0(mx mxVar) {
        int ordinal = mxVar.ordinal();
        if (ordinal == 0) {
            return ProjectViewItemSortableValueType.FLOAT;
        }
        if (ordinal == 1) {
            return ProjectViewItemSortableValueType.INTEGER;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return ProjectViewItemSortableValueType.STRING;
            }
            if (ordinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return ProjectViewItemSortableValueType.NULL;
    }

    public static final MergeStateStatus g0(ff ffVar) {
        switch (ffVar.ordinal()) {
            case 0:
                return MergeStateStatus.BEHIND;
            case 1:
                return MergeStateStatus.BLOCKED;
            case 2:
                return MergeStateStatus.CLEAN;
            case 3:
                return MergeStateStatus.DIRTY;
            case 4:
                return MergeStateStatus.DRAFT;
            case 5:
                return MergeStateStatus.HAS_HOOKS;
            case 6:
                return MergeStateStatus.UNKNOWN;
            case 7:
                return MergeStateStatus.UNSTABLE;
            case 8:
                return MergeStateStatus.UNKNOWN__;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final yz0.x7 h0(ur0.p0 p0Var) {
        IssueOrPullRequestState issueOrPullRequestState;
        int ordinal = p0Var.b.ordinal();
        if (ordinal == 0) {
            issueOrPullRequestState = IssueOrPullRequestState.ISSUE_CLOSED;
        } else if (ordinal == 1) {
            issueOrPullRequestState = IssueOrPullRequestState.ISSUE_OPEN;
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
        }
        return new yz0.x7(issueOrPullRequestState, p0Var.d);
    }

    public static final String i0(ArrayList arrayList) {
        Object obj;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (t71.w.y(((ba.e) obj).a, "Content-Type", true)) {
                break;
            }
        }
        ba.e eVar = (ba.e) obj;
        if (eVar != null) {
            return eVar.b;
        }
        return null;
    }

    public static final Exception j0(String str, FileNotFoundException fileNotFoundException) {
        int i;
        boolean z = false;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            k71.k.f(method, "getMethod(...)");
            try {
                Parcel obtain = Parcel.obtain();
                k71.k.f(obtain, "obtain(...)");
                Process.myUserHandle().writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                i = obtain.readInt();
            } catch (Throwable unused) {
                i = 0;
            }
            Object invoke = method.invoke(null, "sys.user." + i + ".ce_available", "false");
            k71.k.e(invoke, "null cannot be cast to non-null type kotlin.String");
            z = ((String) invoke).equals("true");
        } catch (Throwable th) {
            sy.u.a(fileNotFoundException, th);
        }
        if (z || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused2) {
            return new DirectBootUsageException(fileNotFoundException);
        } finally {
            file.delete();
        }
    }

    public static z4 l0() {
        String str;
        ClassLoader classLoader = d5.class.getClassLoader();
        if (z4.class.equals(z4.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!z4.class.getPackage().equals(d5.class.getPackage())) {
                throw new IllegalArgumentException(z4.class.getName());
            }
            str = z4.class.getPackage().getName() + ".BlazeGenerated" + z4.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    no.a.y(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException(e);
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (InstantiationException e3) {
                throw new IllegalStateException(e3);
            } catch (NoSuchMethodException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new d5[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e5) {
                        Logger.getLogger(y4.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(z4.class.getSimpleName()), (Throwable) e5);
                    }
                }
                if (arrayList.size() == 1) {
                    return (z4) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (z4) z4.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(e6);
                } catch (NoSuchMethodException e7) {
                    throw new IllegalStateException(e7);
                } catch (InvocationTargetException e8) {
                    throw new IllegalStateException(e8);
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static l81.n q(j71.c cVar) {
        l81.b bVar = l81.c.d;
        k71.k.g(bVar, "from");
        l81.f fVar = new l81.f();
        l81.h hVar = ((l81.c) bVar).a;
        fVar.a = hVar.a;
        fVar.b = hVar.d;
        fVar.c = hVar.b;
        fVar.d = hVar.c;
        String str = hVar.e;
        fVar.e = hVar.f;
        String str2 = hVar.g;
        l81.a aVar = hVar.i;
        boolean z = hVar.h;
        fVar.f = ((l81.c) bVar).b;
        cVar.k(fVar);
        if (!k71.k.b(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        l81.h hVar2 = new l81.h(fVar.a, fVar.c, fVar.d, fVar.b, str, fVar.e, str2, z, aVar);
        b21.l lVar = fVar.f;
        k71.k.g(lVar, "module");
        l81.n nVar = new l81.n(hVar2, lVar);
        if (!lVar.equals(kotlinx.serialization.modules.e.a)) {
            boolean z2 = hVar2.i != l81.a.r;
            for (Map.Entry entry : ((Map) lVar.s).entrySet()) {
                r71.b bVar2 = (r71.b) entry.getKey();
                kotlinx.serialization.modules.c cVar2 = (kotlinx.serialization.modules.c) entry.getValue();
                if (cVar2 instanceof kotlinx.serialization.modules.a) {
                    k71.k.e(bVar2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    throw null;
                }
                if (!(cVar2 instanceof kotlinx.serialization.modules.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                k71.k.g(bVar2, "kClass");
            }
            for (Map.Entry entry2 : ((Map) lVar.t).entrySet()) {
                r71.b bVar3 = (r71.b) entry2.getKey();
                for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                    r71.b bVar4 = (r71.b) entry3.getKey();
                    KSerializer kSerializer = (KSerializer) entry3.getValue();
                    k71.k.e(bVar3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    k71.k.e(bVar4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    k71.k.e(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                    SerialDescriptor descriptor = kSerializer.getDescriptor();
                    y9.a e = descriptor.e();
                    if ((e instanceof i81.d) || k71.k.b(e, i81.i.e)) {
                        throw new IllegalArgumentException("Serializer for " + ((k71.e) bVar4).c() + " can't be registered as a subclass for polymorphic serialization because its kind " + e + " is not concrete. To work with multiple hierarchies, register it as a base class.");
                    }
                    if (z2 && (k71.k.b(e, i81.k.f) || k71.k.b(e, i81.k.g) || (e instanceof i81.f) || (e instanceof i81.j))) {
                        throw new IllegalArgumentException("Serializer for " + ((k71.e) bVar4).c() + " of kind " + e + " cannot be serialized polymorphically with class discriminator.");
                    }
                    if (z2) {
                        int f = descriptor.f();
                        for (int i = 0; i < f; i++) {
                            String g = descriptor.g(i);
                            if (k71.k.b(g, hVar2.g)) {
                                throw new IllegalArgumentException("Polymorphic serializer for " + bVar4 + " has property '" + g + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                            }
                        }
                    }
                }
            }
            for (Map.Entry entry4 : ((Map) lVar.u).entrySet()) {
                r71.b bVar5 = (r71.b) entry4.getKey();
                j71.c cVar3 = (j71.c) entry4.getValue();
                k71.k.e(bVar5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                k71.k.e(cVar3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
                k71.z.c(1, cVar3);
            }
            for (Map.Entry entry5 : ((Map) lVar.w).entrySet()) {
                r71.b bVar6 = (r71.b) entry5.getKey();
                j71.c cVar4 = (j71.c) entry5.getValue();
                k71.k.e(bVar6, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                k71.k.e(cVar4, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
                k71.z.c(1, cVar4);
            }
        }
        return nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0075  */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object r(k6.v vVar, Context context, b6.m mVar, k6.u uVar, hz.k kVar, c71.c cVar) {
        k6.q qVar;
        k6.d dVar;
        k6.q qVar2;
        b71.a aVar;
        androidx.compose.runtime.w wVar;
        Context context2;
        k6.d dVar2;
        Context context3;
        b6.m mVar2;
        k6.u uVar2;
        b6.m mVar3;
        k6.v vVar2;
        b6.m mVar4;
        Context context4;
        k6.d dVar3;
        androidx.compose.runtime.w wVar2;
        androidx.compose.runtime.w wVar3;
        d1.c2 c2Var;
        androidx.compose.runtime.w wVar4;
        int i;
        Context context5 = context;
        b6.m mVar5 = mVar;
        try {
            if (cVar instanceof k6.q) {
                qVar = (k6.q) cVar;
                i = qVar.D;
                if ((i & Integer.MIN_VALUE) != 0) {
                    int i2 = i - Integer.MIN_VALUE;
                    qVar.D = i2;
                    dVar = i2;
                    qVar2 = qVar;
                    Object obj = qVar2.C;
                    aVar = b71.a.r;
                    wVar = qVar2.D;
                    if (wVar == 0) {
                        try {
                            if (wVar != 1) {
                                if (wVar != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                androidx.compose.runtime.w wVar5 = (androidx.compose.runtime.w) qVar2.x;
                                mVar4 = (androidx.compose.runtime.i2) qVar2.w;
                                context4 = (v71.d1) qVar2.v;
                                dVar3 = (k6.d) qVar2.u;
                                sy.y.j(obj);
                                wVar3 = wVar5;
                                wVar3.a();
                                dVar3.a();
                                context4.m((CancellationException) null);
                                mVar4.A();
                                return w61.a0.a;
                            }
                            androidx.compose.runtime.w wVar6 = qVar2.B;
                            b6.m mVar6 = qVar2.A;
                            Context context6 = qVar2.z;
                            k6.d dVar4 = qVar2.y;
                            k6.u uVar3 = (k6.u) qVar2.x;
                            b6.m mVar7 = (b6.m) qVar2.w;
                            Context context7 = (Context) qVar2.v;
                            k6.v vVar3 = (k6.v) qVar2.u;
                            sy.y.j(obj);
                            context2 = context6;
                            dVar2 = dVar4;
                            context3 = context7;
                            mVar2 = mVar6;
                            uVar2 = uVar3;
                            mVar3 = mVar7;
                            vVar2 = vVar3;
                            wVar2 = wVar6;
                        } catch (Throwable th) {
                            th = th;
                            wVar.a();
                            dVar.a();
                            context5.m((CancellationException) null);
                            mVar5.A();
                            throw th;
                        }
                    } else {
                        sy.y.j(obj);
                        dVar2 = new k6.d(vVar);
                        Context z = v71.b0.z(vVar, (a71.h) null, (v71.a0) null, new dn.b(2, (a71.c) null, 2), 3);
                        v71.z zVar = vVar.r;
                        mVar5.getClass();
                        b6.p1 p1Var = new b6.p1(50);
                        y71.y1 c = y71.n1.c(Boolean.FALSE);
                        a71.h pVar = new k6.p(vVar, mVar5, context5);
                        kVar.getClass();
                        a71.h d = v71.b0.d();
                        v71.d1 w0 = zVar.K().w0(v71.w.s);
                        if (w0 != null) {
                            w0.o0(new h1.r(4, d));
                        }
                        b6.m i2Var = new androidx.compose.runtime.i2(zVar.K().A(d).A(pVar));
                        wVar2 = new androidx.compose.runtime.a0(i2Var, new z5.b(p1Var));
                        try {
                            mVar2 = i2Var;
                            context2 = z;
                            try {
                                v71.b0.z(vVar, dVar2, (v71.a0) null, new a0.i(wVar2, mVar5, context5, mVar2, vVar, (a71.c) null, 6, false), 2);
                                mVar3 = mVar;
                                try {
                                    a61.u0 u0Var = new a61.u0(mVar2, mVar3, c, context, p1Var, vVar, uVar, null, 1);
                                    context3 = context;
                                    mVar2 = mVar2;
                                    vVar2 = vVar;
                                    try {
                                        v71.b0.z(vVar2, (a71.h) null, (v71.a0) null, u0Var, 3);
                                        k6.s sVar = new k6.s(2, null);
                                        qVar2.u = vVar2;
                                        qVar2.v = context3;
                                        qVar2.w = mVar3;
                                        uVar2 = uVar;
                                        qVar2.x = uVar2;
                                        qVar2.y = dVar2;
                                        qVar2.z = context2;
                                        qVar2.A = mVar2;
                                        wVar4 = wVar2;
                                        try {
                                            qVar2.B = wVar4;
                                            qVar2.D = 1;
                                            if (y71.n1.u(c, sVar, qVar2) != aVar) {
                                                wVar2 = wVar4;
                                            }
                                            return aVar;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            mVar5 = mVar2;
                                            wVar = wVar4;
                                            context5 = context2;
                                            dVar = dVar2;
                                            wVar.a();
                                            dVar.a();
                                            context5.m((CancellationException) null);
                                            mVar5.A();
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        wVar4 = wVar2;
                                        mVar5 = mVar2;
                                        wVar = wVar4;
                                        context5 = context2;
                                        dVar = dVar2;
                                        wVar.a();
                                        dVar.a();
                                        context5.m((CancellationException) null);
                                        mVar5.A();
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    mVar2 = mVar2;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                mVar5 = mVar2;
                                wVar = wVar2;
                                context5 = context2;
                                dVar = dVar2;
                                wVar.a();
                                dVar.a();
                                context5.m((CancellationException) null);
                                mVar5.A();
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            mVar2 = i2Var;
                            context2 = z;
                        }
                    }
                    c2Var = new d1.c2(vVar2, uVar2, mVar3, dVar2);
                    qVar2.u = dVar2;
                    qVar2.v = context2;
                    qVar2.w = mVar2;
                    qVar2.x = wVar2;
                    qVar2.y = null;
                    qVar2.z = null;
                    qVar2.A = null;
                    qVar2.B = null;
                    qVar2.D = 2;
                    if (mVar3.d(context3, c2Var, qVar2) != aVar) {
                        mVar4 = mVar2;
                        context4 = context2;
                        dVar3 = dVar2;
                        wVar3 = wVar2;
                        wVar3.a();
                        dVar3.a();
                        context4.m((CancellationException) null);
                        mVar4.A();
                        return w61.a0.a;
                    }
                    return aVar;
                }
            }
            c2Var = new d1.c2(vVar2, uVar2, mVar3, dVar2);
            qVar2.u = dVar2;
            qVar2.v = context2;
            qVar2.w = mVar2;
            qVar2.x = wVar2;
            qVar2.y = null;
            qVar2.z = null;
            qVar2.A = null;
            qVar2.B = null;
            qVar2.D = 2;
            if (mVar3.d(context3, c2Var, qVar2) != aVar) {
            }
            return aVar;
        } catch (Throwable th7) {
            th = th7;
            mVar5 = mVar2;
            wVar = wVar2;
            context5 = context2;
            dVar = dVar2;
            wVar.a();
            dVar.a();
            context5.m((CancellationException) null);
            mVar5.A();
            throw th;
        }
        qVar = new k6.q(cVar);
        dVar = i;
        qVar2 = qVar;
        Object obj2 = qVar2.C;
        aVar = b71.a.r;
        wVar = qVar2.D;
        if (wVar == 0) {
        }
    }

    public static void s(String str, StringBuilder sb) {
        k71.k.g(str, "key");
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\n') {
                sb.append("%0A");
            } else if (charAt == '\r') {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
    }

    public static final List t(zx.a0 a0Var) {
        List<zx.c0> list;
        Parcelable d;
        k71.k.g(a0Var, "<this>");
        zx.b0 b0Var = a0Var.a;
        ArrayList arrayList = null;
        if (b0Var != null && (list = b0Var.a) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (zx.c0 c0Var : list) {
                ct.q0 q0Var = c0Var.b;
                if (q0Var != null) {
                    d = sy.c.b(q0Var, true);
                } else {
                    gv.e2 e2Var = c0Var.c;
                    d = e2Var != null ? sy.c.d(e2Var, true) : null;
                }
                if (d != null) {
                    arrayList2.add(d);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? x61.r.r : arrayList;
    }

    public static final List u(f00.b0 b0Var) {
        List<f00.a0> list;
        if (b0Var == null || (list = b0Var.a) == null) {
            return x61.r.r;
        }
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        for (f00.a0 a0Var : list) {
            arrayList.add(new l01.q0(a0Var.b, f0(a0Var.a)));
        }
        return arrayList;
    }

    public static final ArrayList v(Map map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Object obj = map.get(ak.a.t);
        Boolean bool = Boolean.TRUE;
        if (k71.k.b(obj, bool)) {
            arrayList.add(NotificationReasonState.MENTION);
        }
        if (k71.k.b(map.get(ak.a.u), bool)) {
            arrayList.add(NotificationReasonState.REVIEW_REQUESTED);
        }
        if (k71.k.b(map.get(ak.a.v), bool)) {
            arrayList.add(NotificationReasonState.ASSIGN);
        }
        if (k71.k.b(map.get(ak.a.w), bool)) {
            arrayList.add(NotificationReasonState.APPROVAL_REQUESTED);
        }
        return arrayList;
    }

    public static final yz0.l4 w(wk0.c1 c1Var) {
        k71.k.g(c1Var, "<this>");
        return new yz0.l4(b41.b.O(c1Var.g), c1Var.b, c1Var.c, c1Var.d, c1Var.e);
    }

    public static final h01.q x(z70.r3 r3Var) {
        String str;
        u30.a aVar;
        c50.e eVar;
        e30.c r6Var;
        e30.c cVar;
        i40.e eVar2;
        ha0.c cVar2;
        q30.b bVar;
        s30.b bVar2;
        o30.b bVar3;
        m30.b bVar4;
        w40.e eVar3;
        DeploymentStatusState deploymentStatusState;
        w30.b bVar5;
        u50.c cVar3;
        s50.e eVar4;
        e30.c m6Var;
        u40.d dVar;
        o60.e eVar5;
        e40.c cVar4;
        o80.c cVar5;
        c70.c cVar6;
        g30.c cVar7;
        k40.b bVar6;
        k80.b bVar7;
        e80.c cVar8;
        a90.d dVar2;
        a90.b bVar8;
        e90.c cVar9;
        String str2;
        o90.b bVar9;
        o90.b bVar10;
        String str3;
        e30.a aVar2;
        g90.c cVar10;
        String str4;
        o90.b bVar11;
        o90.b bVar12;
        String str5;
        e30.a aVar3;
        q50.b bVar13;
        c80.d dVar3;
        s60.c cVar11;
        m80.f fVar;
        o40.i iVar;
        s40.b bVar14;
        w60.b bVar15;
        w90.b bVar16;
        m60.b bVar17;
        u90.c cVar12;
        e60.c cVar13;
        s80.b bVar18;
        a40.m mVar;
        s90.c cVar14;
        k30.c cVar15;
        q80.b bVar19;
        y50.a aVar4;
        String str6 = r3Var.b;
        z70.q3 q3Var = r3Var.c;
        int i = q3Var.b;
        Iterable<z70.o3> iterable = q3Var.d;
        if (iterable == null) {
            iterable = x61.r.r;
        }
        ArrayList arrayList = new ArrayList();
        for (z70.o3 o3Var : iterable) {
            if (o3Var != null && (aVar4 = o3Var.c) != null) {
                cVar = t.a0.i(aVar4);
            } else if (o3Var != null && (bVar19 = o3Var.d) != null) {
                cVar = t.a0.s(bVar19);
            } else if (o3Var != null && (cVar15 = o3Var.e) != null) {
                cVar = t.a0.d(cVar15);
            } else if (o3Var != null && (cVar14 = o3Var.f) != null) {
                cVar = t.a0.u(cVar14);
            } else if (o3Var != null && (mVar = o3Var.g) != null) {
                cVar = t.a0.e(mVar);
            } else if (o3Var != null && (bVar18 = o3Var.h) != null) {
                cVar = t.a0.t(bVar18);
            } else if (o3Var != null && (cVar13 = o3Var.i) != null) {
                cVar = t.a0.j(cVar13);
            } else if (o3Var != null && (cVar12 = o3Var.j) != null) {
                cVar = t.a0.v(cVar12);
            } else if (o3Var != null && (bVar17 = o3Var.k) != null) {
                cVar = t.a0.k(bVar17);
            } else if (o3Var != null && (bVar16 = o3Var.l) != null) {
                cVar = t.a0.w(bVar16);
            } else if (o3Var != null && (bVar15 = o3Var.m) != null) {
                cVar = t.a0.m(bVar15);
            } else if (o3Var != null && (bVar14 = o3Var.n) != null) {
                cVar = t.a0.h(bVar14);
            } else if (o3Var == null || (iVar = o3Var.o) == null) {
                if (o3Var == null || (fVar = o3Var.p) == null) {
                    str = "";
                    if (o3Var != null && (cVar11 = o3Var.q) != null) {
                        s60.b bVar20 = cVar11.e;
                        String str7 = bVar20 != null ? bVar20.b : "";
                        String str8 = cVar11.d;
                        s60.a aVar5 = cVar11.c;
                        cVar = new yz0.v6(new com.github.service.models.response.a(aVar5 != null ? aVar5.b.b : "", t.q.q(aVar5 != null ? aVar5.b.d : null), (String) null, false, (String) null, 60), str7, str8, cVar11.f);
                    } else if (o3Var != null && (dVar3 = o3Var.r) != null) {
                        cVar = t.a0.o(dVar3);
                    } else if (o3Var == null || (bVar13 = o3Var.s) == null) {
                        if (o3Var != null && (cVar10 = o3Var.u) != null) {
                            g90.b bVar21 = cVar10.d;
                            g90.a aVar6 = cVar10.c;
                            com.github.service.models.response.a c = t.e.c(aVar6 != null ? aVar6.b : null);
                            if (bVar21 == null || (aVar3 = bVar21.b) == null || (str4 = t.e.c(aVar3).z) == null) {
                                str4 = (bVar21 == null || (bVar11 = bVar21.c) == null) ? "" : bVar11.b;
                            }
                            if (bVar21 != null && (bVar12 = bVar21.c) != null && (str5 = bVar12.c.b) != null) {
                                str = str5;
                            }
                            m6Var = new yz0.j7(c, str4, str, cVar10.e);
                        } else if (o3Var != null && (cVar9 = o3Var.v) != null) {
                            e90.b bVar22 = cVar9.d;
                            e90.a aVar7 = cVar9.c;
                            com.github.service.models.response.a c2 = t.e.c(aVar7 != null ? aVar7.b : null);
                            if (bVar22 == null || (aVar2 = bVar22.b) == null || (str2 = t.e.c(aVar2).z) == null) {
                                str2 = (bVar22 == null || (bVar9 = bVar22.c) == null) ? "" : bVar9.b;
                            }
                            if (bVar22 != null && (bVar10 = bVar22.c) != null && (str3 = bVar10.c.b) != null) {
                                str = str3;
                            }
                            m6Var = new yz0.i7(c2, str2, str, cVar9.e);
                        } else if (o3Var != null && (dVar2 = o3Var.w) != null) {
                            a90.a aVar8 = dVar2.c;
                            com.github.service.models.response.a c3 = t.e.c(aVar8 != null ? aVar8.b : null);
                            a90.c cVar16 = dVar2.e;
                            if (cVar16 != null && (bVar8 = cVar16.b) != null) {
                                r6 = bVar8.b;
                            }
                            com.github.service.models.response.a c4 = t.e.c(r6);
                            String str9 = dVar2.d;
                            cVar = new yz0.h7(c3, c4, str9 != null ? str9 : "", dVar2.f);
                        } else if (o3Var != null && (cVar8 = o3Var.x) != null) {
                            cVar = t.a0.p(cVar8);
                        } else if (o3Var != null && (bVar7 = o3Var.y) != null) {
                            k80.a aVar9 = bVar7.c;
                            cVar = new yz0.b7(aVar9 != null ? aVar9.b.b : "", bVar7.d);
                        } else if (o3Var != null && (bVar6 = o3Var.z) != null) {
                            k40.a aVar10 = bVar6.c;
                            cVar = new yz0.d6(aVar10 != null ? aVar10.b.b : "", bVar6.d);
                        } else if (o3Var != null && (cVar7 = o3Var.A) != null) {
                            cVar = t.a0.c(cVar7);
                        } else if (o3Var != null && (cVar6 = o3Var.B) != null) {
                            cVar = t.a0.n(cVar6);
                        } else if (o3Var != null && (cVar5 = o3Var.C) != null) {
                            cVar = t.a0.r(cVar5);
                        } else if (o3Var != null && (cVar4 = o3Var.E) != null) {
                            cVar = t.a0.f(cVar4);
                        } else if (o3Var != null && (eVar5 = o3Var.I) != null) {
                            cVar = t.a0.l(eVar5);
                        } else if (o3Var != null && (dVar = o3Var.D) != null) {
                            u40.a aVar11 = dVar.c;
                            str = aVar11 != null ? aVar11.b.b : "";
                            u40.b bVar23 = dVar.d;
                            String str10 = bVar23.c;
                            hc0.v7 v7Var = bVar23.b;
                            if (v7Var != null) {
                                switch (v7Var.ordinal()) {
                                    case 0:
                                        r6 = DeploymentState.ABANDONED;
                                        break;
                                    case 1:
                                        r6 = DeploymentState.ACTIVE;
                                        break;
                                    case 2:
                                        r6 = DeploymentState.DESTROYED;
                                        break;
                                    case 3:
                                        r6 = DeploymentState.ERROR;
                                        break;
                                    case 4:
                                        r6 = DeploymentState.FAILURE;
                                        break;
                                    case 5:
                                        r6 = DeploymentState.INACTIVE;
                                        break;
                                    case 6:
                                        r6 = DeploymentState.IN_PROGRESS;
                                        break;
                                    case 7:
                                        r6 = DeploymentState.PENDING;
                                        break;
                                    case 8:
                                        r6 = DeploymentState.QUEUED;
                                        break;
                                    case 9:
                                        r6 = DeploymentState.SUCCESS;
                                        break;
                                    case 10:
                                        r6 = DeploymentState.WAITING;
                                        break;
                                    case 11:
                                        r6 = DeploymentState.UNKNOWN__;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                            }
                            cVar = new yz0.j6(str, str10, r6, dVar.e);
                        } else if (o3Var != null && (eVar4 = o3Var.F) != null) {
                            s50.a aVar12 = eVar4.c;
                            String str11 = aVar12 != null ? aVar12.b.b : "";
                            s50.c cVar17 = eVar4.f;
                            String str12 = cVar17 != null ? cVar17.b : "";
                            s50.b bVar24 = eVar4.g;
                            m6Var = new yz0.m6(str11, str12, bVar24 != null ? bVar24.b : "", eVar4.e.b, eVar4.d);
                        } else if (o3Var != null && (cVar3 = o3Var.t) != null) {
                            u50.a aVar13 = cVar3.c;
                            cVar = new yz0.n6(aVar13 != null ? aVar13.b.b : "", cVar3.d.a, cVar3.e);
                        } else if (o3Var != null && (bVar5 = o3Var.H) != null) {
                            w30.a aVar14 = bVar5.c;
                            cVar = new yz0.a6(aVar14 != null ? aVar14.b.b : "", bVar5.e, bVar5.f, bVar5.d);
                        } else if (o3Var != null && (eVar3 = o3Var.J) != null) {
                            w40.a aVar15 = eVar3.c;
                            str = aVar15 != null ? aVar15.b.b : "";
                            w40.c cVar18 = eVar3.e;
                            String str13 = cVar18.d.c;
                            switch (cVar18.b.ordinal()) {
                                case 0:
                                    deploymentStatusState = DeploymentStatusState.ERROR;
                                    break;
                                case 1:
                                    deploymentStatusState = DeploymentStatusState.FAILURE;
                                    break;
                                case 2:
                                    deploymentStatusState = DeploymentStatusState.INACTIVE;
                                    break;
                                case 3:
                                    deploymentStatusState = DeploymentStatusState.IN_PROGRESS;
                                    break;
                                case 4:
                                    deploymentStatusState = DeploymentStatusState.PENDING;
                                    break;
                                case 5:
                                    deploymentStatusState = DeploymentStatusState.QUEUED;
                                    break;
                                case 6:
                                    deploymentStatusState = DeploymentStatusState.SUCCESS;
                                    break;
                                case 7:
                                    deploymentStatusState = DeploymentStatusState.WAITING;
                                    break;
                                case 8:
                                    deploymentStatusState = DeploymentStatusState.UNKNOWN__;
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                            cVar = new yz0.k6(str, str13, deploymentStatusState, eVar3.d);
                        } else if (o3Var != null && (bVar4 = o3Var.N) != null) {
                            m30.a aVar16 = bVar4.b;
                            com.github.service.models.response.a aVar17 = new com.github.service.models.response.a(aVar16 != null ? aVar16.b.b : "", t.q.q(aVar16 != null ? aVar16.b.d : null), (String) null, false, (String) null, 60);
                            String str14 = bVar4.d;
                            cVar = new yz0.v5(aVar17, str14 != null ? str14 : "", bVar4.c);
                        } else if (o3Var != null && (bVar3 = o3Var.K) != null) {
                            o30.a aVar18 = bVar3.b;
                            cVar = new yz0.w5(new com.github.service.models.response.a(aVar18 != null ? aVar18.b.b : "", t.q.q(aVar18 != null ? aVar18.b.d : null), (String) null, false, (String) null, 60), bVar3.c);
                        } else if (o3Var != null && (bVar2 = o3Var.L) != null) {
                            s30.a aVar19 = bVar2.b;
                            cVar = new yz0.y5(new com.github.service.models.response.a(aVar19 != null ? aVar19.b.b : "", t.q.q(aVar19 != null ? aVar19.b.d : null), (String) null, false, (String) null, 60), bVar2.c);
                        } else if (o3Var != null && (bVar = o3Var.M) != null) {
                            q30.a aVar20 = bVar.b;
                            cVar = new yz0.x5(new com.github.service.models.response.a(aVar20 != null ? aVar20.b.b : "", t.q.q(aVar20 != null ? aVar20.b.d : null), (String) null, false, (String) null, 60), bVar.c);
                        } else if (o3Var == null || (cVar2 = o3Var.O) == null) {
                            if (o3Var != null && (eVar2 = o3Var.P) != null) {
                                i40.b bVar25 = eVar2.d.b;
                                TimelineItem$LinkedItemConnectorType timelineItem$LinkedItemConnectorType = TimelineItem$LinkedItemConnectorType.LINKED;
                                i40.a aVar21 = eVar2.c;
                                String str15 = aVar21 != null ? aVar21.b.b : null;
                                String str16 = str15 == null ? "" : str15;
                                r01.e eVar6 = IssueState.Companion;
                                String str17 = bVar25 != null ? bVar25.a.r : null;
                                if (str17 == null) {
                                    str17 = "";
                                }
                                eVar6.getClass();
                                IssueState b = r01.e.b(str17);
                                int i2 = bVar25 != null ? bVar25.d : 0;
                                String str18 = bVar25 != null ? bVar25.b : null;
                                String str19 = str18 == null ? "" : str18;
                                String str20 = bVar25 != null ? bVar25.c : null;
                                r6Var = new yz0.r6(timelineItem$LinkedItemConnectorType, str16, i2, str19, str20 == null ? "" : str20, eVar2.e, b, t.a0.N(bVar25 != null ? bVar25.e : null));
                            } else if (o3Var == null || (eVar = o3Var.Q) == null) {
                                if (o3Var != null && (aVar = o3Var.R) != null) {
                                    r6 = new yz0.z5(aVar.b, aVar.d, aVar.e, aVar.c);
                                }
                                cVar = r6;
                            } else {
                                c50.b bVar26 = eVar.d.b;
                                TimelineItem$LinkedItemConnectorType timelineItem$LinkedItemConnectorType2 = TimelineItem$LinkedItemConnectorType.UNLINKED;
                                c50.a aVar22 = eVar.c;
                                String str21 = aVar22 != null ? aVar22.b.b : null;
                                String str22 = str21 == null ? "" : str21;
                                r01.e eVar7 = IssueState.Companion;
                                String str23 = bVar26 != null ? bVar26.a.r : null;
                                if (str23 == null) {
                                    str23 = "";
                                }
                                eVar7.getClass();
                                IssueState b2 = r01.e.b(str23);
                                int i3 = bVar26 != null ? bVar26.d : 0;
                                String str24 = bVar26 != null ? bVar26.b : null;
                                String str25 = str24 == null ? "" : str24;
                                String str26 = bVar26 != null ? bVar26.c : null;
                                r6Var = new yz0.r6(timelineItem$LinkedItemConnectorType2, str22, i3, str25, str26 == null ? "" : str26, eVar.e, b2, t.a0.N(bVar26 != null ? bVar26.e : null));
                            }
                            cVar = r6Var;
                        } else {
                            cVar = t.a0.x(cVar2);
                        }
                        cVar = m6Var;
                    } else {
                        String str27 = bVar13.d;
                        q50.a aVar23 = bVar13.c;
                        cVar = new yz0.l6(new com.github.service.models.response.a(aVar23 != null ? aVar23.b.b : "", t.q.q(aVar23 != null ? aVar23.b.d : null), (String) null, false, (String) null, 60), str27, bVar13.e);
                    }
                } else {
                    if (fVar.f != null) {
                        cVar = t.a0.q(fVar);
                    }
                    cVar = r6;
                }
            } else {
                cVar = t.a0.g(iVar);
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        List F0 = x61.m.F0(arrayList);
        z70.p3 p3Var = q3Var.c;
        return new h01.q(str6, i, F0, p3Var.a, p3Var.b, p3Var.c, p3Var.d);
    }

    public static final List y(w50.w wVar) {
        c50.e eVar;
        String str;
        Object s6Var;
        Object obj;
        i40.e eVar2;
        m40.e eVar3;
        ha0.c cVar;
        q90.c cVar2;
        y90.b bVar;
        p70.b bVar2;
        o60.e eVar4;
        e40.c cVar3;
        o80.c cVar4;
        c70.c cVar5;
        g30.c cVar6;
        m80.f fVar;
        o40.i iVar;
        s40.b bVar3;
        w60.b bVar4;
        w90.b bVar5;
        m60.b bVar6;
        u90.c cVar7;
        e60.c cVar8;
        s80.b bVar7;
        a40.m mVar;
        s90.c cVar9;
        k30.c cVar10;
        q80.b bVar8;
        y50.a aVar;
        Iterable<w50.u> iterable = wVar.d;
        if (iterable == null) {
            iterable = x61.r.r;
        }
        ArrayList arrayList = new ArrayList();
        for (w50.u uVar : iterable) {
            if (uVar != null && (aVar = uVar.c) != null) {
                obj = t.a0.i(aVar);
            } else if (uVar != null && (bVar8 = uVar.d) != null) {
                obj = t.a0.s(bVar8);
            } else if (uVar != null && (cVar10 = uVar.e) != null) {
                obj = t.a0.d(cVar10);
            } else if (uVar != null && (cVar9 = uVar.f) != null) {
                obj = t.a0.u(cVar9);
            } else if (uVar != null && (mVar = uVar.g) != null) {
                obj = t.a0.e(mVar);
            } else if (uVar != null && (bVar7 = uVar.h) != null) {
                obj = t.a0.t(bVar7);
            } else if (uVar != null && (cVar8 = uVar.i) != null) {
                obj = t.a0.j(cVar8);
            } else if (uVar != null && (cVar7 = uVar.j) != null) {
                obj = t.a0.v(cVar7);
            } else if (uVar != null && (bVar6 = uVar.k) != null) {
                obj = t.a0.k(bVar6);
            } else if (uVar != null && (bVar5 = uVar.l) != null) {
                obj = t.a0.w(bVar5);
            } else if (uVar != null && (bVar4 = uVar.m) != null) {
                obj = t.a0.m(bVar4);
            } else if (uVar != null && (bVar3 = uVar.n) != null) {
                obj = t.a0.h(bVar3);
            } else if (uVar != null && (iVar = uVar.o) != null) {
                obj = t.a0.g(iVar);
            } else if (uVar != null && (fVar = uVar.p) != null) {
                if (fVar.f != null) {
                    obj = t.a0.q(fVar);
                }
                obj = null;
            } else if (uVar != null && (cVar6 = uVar.q) != null) {
                obj = t.a0.c(cVar6);
            } else if (uVar != null && (cVar5 = uVar.r) != null) {
                obj = t.a0.n(cVar5);
            } else if (uVar != null && (cVar4 = uVar.s) != null) {
                obj = t.a0.r(cVar4);
            } else if (uVar != null && (cVar3 = uVar.v) != null) {
                obj = t.a0.f(cVar3);
            } else if (uVar == null || (eVar4 = uVar.x) == null) {
                if (uVar != null && (bVar2 = uVar.t) != null) {
                    p70.a aVar2 = bVar2.c;
                    obj = new yz0.y6(aVar2 != null ? aVar2.b.b : "", bVar2.d);
                } else if (uVar != null && (bVar = uVar.u) != null) {
                    y90.a aVar3 = bVar.c;
                    obj = new yz0.q7(aVar3 != null ? aVar3.b.b : "", bVar.d);
                } else if (uVar != null && (cVar2 = uVar.w) != null) {
                    q90.a aVar4 = cVar2.c;
                    String str2 = aVar4 != null ? aVar4.b.b : "";
                    q90.b bVar9 = cVar2.e;
                    obj = new yz0.m7(str2, bVar9 != null ? bVar9.b : "", cVar2.d);
                } else if (uVar != null && (cVar = uVar.y) != null) {
                    obj = t.a0.x(cVar);
                } else if (uVar == null || (eVar3 = uVar.z) == null) {
                    if (uVar == null || (eVar2 = uVar.A) == null) {
                        if (uVar != null && (eVar = uVar.B) != null) {
                            c50.c cVar11 = eVar.d.c;
                            TimelineItem$LinkedItemConnectorType timelineItem$LinkedItemConnectorType = TimelineItem$LinkedItemConnectorType.UNLINKED;
                            c50.a aVar5 = eVar.c;
                            String str3 = aVar5 != null ? aVar5.b.b : null;
                            String str4 = str3 == null ? "" : str3;
                            yz0.o3 o3Var = PullRequestState.Companion;
                            String str5 = cVar11 != null ? cVar11.a.r : null;
                            if (str5 == null) {
                                str5 = "";
                            }
                            o3Var.getClass();
                            PullRequestState b = yz0.o3.b(str5);
                            int i = cVar11 != null ? cVar11.e : 0;
                            String str6 = cVar11 != null ? cVar11.c : null;
                            String str7 = str6 == null ? "" : str6;
                            str = cVar11 != null ? cVar11.d : null;
                            s6Var = new yz0.s6(timelineItem$LinkedItemConnectorType, str4, i, str7, str == null ? "" : str, eVar.e, b, cVar11 != null && cVar11.b, false);
                        }
                        obj = null;
                    } else {
                        i40.c cVar12 = eVar2.d.c;
                        TimelineItem$LinkedItemConnectorType timelineItem$LinkedItemConnectorType2 = TimelineItem$LinkedItemConnectorType.LINKED;
                        i40.a aVar6 = eVar2.c;
                        String str8 = aVar6 != null ? aVar6.b.b : null;
                        String str9 = str8 == null ? "" : str8;
                        yz0.o3 o3Var2 = PullRequestState.Companion;
                        String str10 = cVar12 != null ? cVar12.a.r : null;
                        if (str10 == null) {
                            str10 = "";
                        }
                        o3Var2.getClass();
                        PullRequestState b2 = yz0.o3.b(str10);
                        int i2 = cVar12 != null ? cVar12.e : 0;
                        String str11 = cVar12 != null ? cVar12.c : null;
                        String str12 = str11 == null ? "" : str11;
                        str = cVar12 != null ? cVar12.d : null;
                        s6Var = new yz0.s6(timelineItem$LinkedItemConnectorType2, str9, i2, str12, str == null ? "" : str, eVar2.e, b2, cVar12 != null && cVar12.b, false);
                    }
                    obj = s6Var;
                } else {
                    String str13 = eVar3.b;
                    m40.a aVar7 = eVar3.c;
                    String str14 = aVar7 != null ? aVar7.b.b : "";
                    m40.b bVar10 = eVar3.d;
                    obj = new yz0.p6(str13, str14, bVar10 != null ? bVar10.a : 0, bVar10 != null ? bVar10.b : "", bVar10 != null ? bVar10.c.a.b : "", bVar10 != null ? bVar10.c.b : "", eVar3.e);
                }
            } else {
                obj = t.a0.l(eVar4);
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return x61.m.F0(arrayList);
    }

    public static final boolean z(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj != obj2 && !k71.k.b(obj, obj2)) {
                if (obj != null && obj2 != null) {
                    if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                        if (!z((Bundle) obj, (Bundle) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                        if (!x61.l.u((Object[]) obj, (Object[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                        if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                        if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                        if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                        if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                        if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                        if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                        if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            return false;
                        }
                    } else if (!obj.equals(obj2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public void C(SerialDescriptor serialDescriptor, int i, boolean z) {
        k71.k.g(serialDescriptor, "descriptor");
        D(serialDescriptor, i);
        g(z);
    }

    public abstract void D(SerialDescriptor serialDescriptor, int i);

    public Encoder E(k81.g1 g1Var, int i) {
        k71.k.g(g1Var, "descriptor");
        D(g1Var, i);
        return m(g1Var.j(i));
    }

    public void F(int i, int i2, SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "descriptor");
        D(serialDescriptor, i);
        l(i2);
    }

    public void G(SerialDescriptor serialDescriptor, int i, long j) {
        k71.k.g(serialDescriptor, "descriptor");
        D(serialDescriptor, i);
        o(j);
    }

    public void H(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        k71.k.g(serialDescriptor, "descriptor");
        k71.k.g(kSerializer, "serializer");
        D(serialDescriptor, i);
        if (kSerializer.getDescriptor().c()) {
            n(kSerializer, obj);
        } else if (obj == null) {
            c();
        } else {
            n(kSerializer, obj);
        }
    }

    public void I(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        k71.k.g(serialDescriptor, "descriptor");
        k71.k.g(kSerializer, "serializer");
        D(serialDescriptor, i);
        n(kSerializer, obj);
    }

    public void J(SerialDescriptor serialDescriptor, int i, String str) {
        k71.k.g(serialDescriptor, "descriptor");
        k71.k.g(str, "value");
        D(serialDescriptor, i);
        p(str);
    }

    public void K(Object obj) {
        k71.k.g(obj, "value");
        throw new SerializationException("Non-serializable " + k71.x.a(obj.getClass()) + " is not supported by " + k71.x.a(getClass()) + " encoder");
    }

    public void L(SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "descriptor");
    }

    public abstract boolean P();

    public abstract void S(int i);

    public abstract void T(Typeface typeface, boolean z);

    public abstract void V(boolean z);

    public abstract void W(boolean z);

    public boolean X(SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "descriptor");
        return true;
    }

    public d5 b(SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "descriptor");
        return this;
    }

    public void d(double d) {
        K(Double.valueOf(d));
    }

    public void e(short s) {
        K(Short.valueOf(s));
    }

    public void f(byte b) {
        K(Byte.valueOf(b));
    }

    public void g(boolean z) {
        K(Boolean.valueOf(z));
    }

    public void h(float f) {
        K(Float.valueOf(f));
    }

    public void i(char c) {
        K(Character.valueOf(c));
    }

    public void k(SerialDescriptor serialDescriptor, int i) {
        k71.k.g(serialDescriptor, "enumDescriptor");
        K(Integer.valueOf(i));
    }

    public abstract void k0(byte[] bArr, int i, int i2);

    public void l(int i) {
        K(Integer.valueOf(i));
    }

    public abstract Encoder m(SerialDescriptor serialDescriptor);

    public void o(long j) {
        K(Long.valueOf(j));
    }

    public void p(String str) {
        k71.k.g(str, "value");
        K(str);
    }
}
