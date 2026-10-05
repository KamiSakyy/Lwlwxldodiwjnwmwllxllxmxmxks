package com.github.rudroid.settings.codeoptions;

import android.text.style.CharacterStyle;
import android.text.style.ImageSpan;
import d2.o0;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
abstract class i0 {
    public static final /* synthetic */ i0[] r;
    public static final /* synthetic */ d71.b s;

    static {
        i0[] i0VarArr = {new i0() { // from class: com.github.rudroid.settings.codeoptions.i0.b
            @Override // com.github.rudroid.settings.codeoptions.i0
            public final void a(CharacterStyle characterStyle, int i, int i2, g3.d dVar) {
                String str;
                ImageSpan imageSpan = characterStyle instanceof ImageSpan ? (ImageSpan) characterStyle : null;
                if (imageSpan == null || (str = imageSpan.getSource()) == null) {
                    str = "";
                }
                dVar.a(i, i2, "image_key", str);
            }

            @Override // com.github.rudroid.settings.codeoptions.i0
            public final Class b() {
                return ImageSpan.class;
            }
        }, new i0() { // from class: com.github.rudroid.settings.codeoptions.i0.a
            @Override // com.github.rudroid.settings.codeoptions.i0
            public final void a(CharacterStyle characterStyle, int i, int i2, g3.d dVar) {
                dVar.b(com.github.rudroid.uitoolkit.utils.j.a, i, i2);
            }

            @Override // com.github.rudroid.settings.codeoptions.i0
            public final Class b() {
                return sd.a.class;
            }
        }, new i0() { // from class: com.github.rudroid.settings.codeoptions.i0.c
            @Override // com.github.rudroid.settings.codeoptions.i0
            public final void a(CharacterStyle characterStyle, int i, int i2, g3.d dVar) {
                sd.f fVar = (sd.f) characterStyle;
                int i3 = fVar.r;
                int style = fVar.getStyle();
                g3.h0 a2 = g3.h0.a(style != 1 ? style != 2 ? style != 3 ? new g3.h0(d2.a0.c(i3), 0L, (k3.s) null, (k3.o) null, (k3.p) null, (k3.i) null, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, 0L, (r3.l) null, (o0) null, 65534) : new g3.h0(d2.a0.c(i3), 0L, k3.s.z, new k3.o(1), (k3.p) null, (k3.i) null, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, 0L, (r3.l) null, (o0) null, 65522) : new g3.h0(0L, 0L, (k3.s) null, new k3.o(1), (k3.p) null, (k3.i) null, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, 0L, (r3.l) null, (o0) null, 65527) : new g3.h0(d2.a0.c(i3), 0L, k3.s.z, (k3.o) null, (k3.p) null, (k3.i) null, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, 0L, (r3.l) null, (o0) null, 65530), d2.a0.c(i3), 0L, fVar.t ? r3.l.c : null, 61438);
                Integer num = fVar.s;
                if (num != null) {
                    dVar.b(g3.h0.a(a2, 0L, d2.a0.c(num.intValue()), (r3.l) null, 63487), i, i2);
                } else {
                    dVar.b(a2, i, i2);
                }
            }

            @Override // com.github.rudroid.settings.codeoptions.i0
            public final Class b() {
                return sd.f.class;
            }
        }};
        r = i0VarArr;
        s = l0.t(i0VarArr);
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) r.clone();
    }

    public abstract void a(CharacterStyle characterStyle, int i, int i2, g3.d dVar);

    public abstract Class b();
}
