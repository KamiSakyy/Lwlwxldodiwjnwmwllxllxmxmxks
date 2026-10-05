package com.github.rudroid.shortcuts.navigation;

import com.google.android.gms.internal.measurement.d5;
import j81.a;
import k71.k;
import k81.c1;
import k81.d0;
import k81.e1;
import k81.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import w61.c;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class ShortcutViewEntryPointRoute$$serializer implements d0 {
    public static final int $stable;
    public static final ShortcutViewEntryPointRoute$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ShortcutViewEntryPointRoute$$serializer shortcutViewEntryPointRoute$$serializer = new ShortcutViewEntryPointRoute$$serializer();
        INSTANCE = shortcutViewEntryPointRoute$$serializer;
        e1 e1Var = new e1("com.github.rudroid.shortcuts.navigation.ShortcutViewEntryPointRoute", shortcutViewEntryPointRoute$$serializer, 1);
        e1Var.l("shortcutId", false);
        descriptor = e1Var;
        $stable = 8;
    }

    private ShortcutViewEntryPointRoute$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        return new KSerializer[]{q1.a};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final ShortcutViewEntryPointRoute m80deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b = decoder.b(serialDescriptor);
        String str = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int t = b.t(serialDescriptor);
            if (t == -1) {
                z = false;
            } else {
                if (t != 0) {
                    throw new UnknownFieldException(t);
                }
                str = b.r(serialDescriptor, 0);
                i = 1;
            }
        }
        b.g(serialDescriptor);
        return new ShortcutViewEntryPointRoute(str, i);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, ShortcutViewEntryPointRoute shortcutViewEntryPointRoute) {
        k.g(encoder, "encoder");
        k.g(shortcutViewEntryPointRoute, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        b.J(serialDescriptor, 0, shortcutViewEntryPointRoute.a);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
