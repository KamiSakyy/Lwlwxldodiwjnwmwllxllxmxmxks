package r4;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes.dex */
public class h extends com.google.common.util.concurrent.a {
    public static Font c0(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int f02 = f0(fontStyle, font.getStyle());
        for (int i10 = 1; i10 < fontFamily.getSize(); i10++) {
            Font font2 = fontFamily.getFont(i10);
            int f03 = f0(fontStyle, font2.getStyle());
            if (f03 < f02) {
                font = font2;
                f02 = f03;
            }
        }
        return font;
    }

    public static int f0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final FontFamily d0(x4.h[] hVarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (x4.h hVar : hVarArr) {
            if (Objects.equals(hVar.f33775a.getScheme(), "systemfont")) {
                font = e0(hVar);
            } else {
                try {
                    Uri uri = hVar.f33775a;
                    str = hVar.f33779e;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(hVar.f33777c).setSlant(hVar.f33778d ? 1 : 0).setTtcIndex(hVar.f33776b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        font = ttcIndex.build();
                        openFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            if (font != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(font);
                } else {
                    builder.addFont(font);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font e0(x4.h hVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    public final Typeface k(Context context, q4.e eVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (q4.f fVar : eVar.f30942a) {
                try {
                    Font build = new Font.Builder(resources, fVar.f30948f).setWeight(fVar.f30944b).setSlant(fVar.f30945c ? 1 : 0).setTtcIndex(fVar.f30947e).setFontVariationSettings(fVar.f30946d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(c0(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    public final Typeface l(Context context, x4.h[] hVarArr, int i) {
        try {
            FontFamily d02 = d0(hVarArr, context.getContentResolver());
            if (d02 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(d02).setStyle(c0(d02, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public final Typeface m(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily d02 = d0((x4.h[]) list.get(0), contentResolver);
            if (d02 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(d02);
            for (int i10 = 1; i10 < list.size(); i10++) {
                FontFamily d03 = d0((x4.h[]) list.get(i10), contentResolver);
                if (d03 != null) {
                    customFallbackBuilder.addCustomFallback(d03);
                }
            }
            return customFallbackBuilder.setStyle(c0(d02, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public final Typeface n(Context context, Resources resources, int i, String str, int i10) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public final x4.h q(x4.h[] hVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
