package u31;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a0 {
    public final int a;
    public final n b;
    public final int[][] c;
    public final n[] d;
    public final z e;
    public final z f;
    public final z g;
    public final z h;

    public a0(l7.e eVar) {
        this.a = eVar.b;
        this.b = (n) eVar.e;
        this.c = (int[][]) eVar.f;
        this.d = (n[]) eVar.c;
        this.e = (z) eVar.d;
        this.f = (z) eVar.g;
        this.g = (z) eVar.h;
        this.h = (z) eVar.i;
    }

    public static void a(l7.e eVar, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = x21.a.z;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                n a = n.a(obtainAttributes.getResourceId(0, 0), obtainAttributes.getResourceId(1, 0), context).a();
                obtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != 2130969724 && attributeNameResource != 2130969735) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                eVar.b(StateSet.trimStateSet(iArr2, i), a);
            }
        }
    }

    public static a0 b(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        AttributeSet asAttributeSet;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        l7.e eVar = new l7.e(2);
        eVar.j();
        try {
            xml = context.getResources().getXml(resourceId);
            try {
                asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            eVar.j();
        }
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        if (xml.getName().equals("selector")) {
            a(eVar, context, xml, asAttributeSet, context.getTheme());
        }
        xml.close();
        if (eVar.b == 0) {
            return null;
        }
        return new a0(eVar);
    }

    public final n c() {
        n nVar = this.b;
        z zVar = this.h;
        z zVar2 = this.g;
        z zVar3 = this.f;
        z zVar4 = this.e;
        if (zVar4 == null && zVar3 == null && zVar2 == null && zVar == null) {
            return nVar;
        }
        m g = nVar.g();
        if (zVar4 != null) {
            g.e = zVar4.b;
        }
        if (zVar3 != null) {
            g.f = zVar3.b;
        }
        if (zVar2 != null) {
            g.h = zVar2.b;
        }
        if (zVar != null) {
            g.g = zVar.b;
        }
        return g.a();
    }

    public final boolean d() {
        z zVar;
        z zVar2;
        z zVar3;
        z zVar4;
        return this.a > 1 || ((zVar = this.e) != null && zVar.a > 1) || (((zVar2 = this.f) != null && zVar2.a > 1) || (((zVar3 = this.g) != null && zVar3.a > 1) || ((zVar4 = this.h) != null && zVar4.a > 1)));
    }
}
