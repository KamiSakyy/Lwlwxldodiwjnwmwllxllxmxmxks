package q4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import l7.z1;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f30960a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f30961b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f30962c = new Object();

    public static Typeface a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i, new TypedValue(), 0, null, false, false);
    }

    public static Typeface b(Context context, int i, TypedValue typedValue, int i10, b bVar, boolean z10, boolean z11) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        Typeface typeface = null;
        if (charSequence2.startsWith("res/")) {
            int i11 = typedValue.assetCookie;
            z1 z1Var = r4.e.f31156b;
            Typeface typeface2 = (Typeface) z1Var.h(r4.e.b(resources, i, charSequence2, i11, i10));
            if (typeface2 != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new b9.f(12, bVar, typeface2));
                }
                typeface = typeface2;
            } else if (!z11) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        d k10 = b.k(resources.getXml(i), resources);
                        if (k10 != null) {
                            typeface = r4.e.a(context, k10, resources, i, charSequence2, typedValue.assetCookie, i10, bVar, z10);
                        } else if (bVar != null) {
                            bVar.a(-3);
                        }
                    } else {
                        int i12 = typedValue.assetCookie;
                        Typeface n10 = r4.e.f31155a.n(context, resources, i, charSequence2, i10);
                        if (n10 != null) {
                            z1Var.l(r4.e.b(resources, i, charSequence2, i12, i10), n10);
                        }
                        if (bVar != null) {
                            if (n10 != null) {
                                new Handler(Looper.getMainLooper()).post(new b9.f(12, bVar, n10));
                            } else {
                                bVar.a(-3);
                            }
                        }
                        typeface = n10;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (bVar != null) {
                        bVar.a(-3);
                    }
                }
            }
        } else if (bVar != null) {
            bVar.a(-3);
        }
        if (typeface != null || bVar != null || z11) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
