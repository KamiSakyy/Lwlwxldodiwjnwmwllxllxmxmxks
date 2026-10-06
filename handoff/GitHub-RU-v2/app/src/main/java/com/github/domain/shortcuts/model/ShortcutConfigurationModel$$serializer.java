package com.github.domain.shortcuts.model;

import bm.n;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.github.service.models.response.shortcuts.ShortcutIcon;
import com.github.service.models.response.shortcuts.ShortcutType;
import com.google.android.gms.internal.measurement.d5;
import j81.a;
import java.util.List;
import k71.k;
import k81.c1Shadow;
import k81.d0;
import k81.e1;
import k81.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import w61.c;
import w61.h;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class ShortcutConfigurationModel$$serializer implements d0 {
    public static final ShortcutConfigurationModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ShortcutConfigurationModel$$serializer shortcutConfigurationModel$$serializer = new ShortcutConfigurationModel$$serializer();
        INSTANCE = shortcutConfigurationModel$$serializer;
        e1 e1Var = new e1("com.github.domain.shortcuts.model.ShortcutConfigurationModel", shortcutConfigurationModel$$serializer, 7);
        e1Var.l("fullQueryString", true);
        e1Var.l("query", false);
        e1Var.l("color", false);
        e1Var.l("icon", false);
        e1Var.l("scope", false);
        e1Var.l("targetType", false);
        e1Var.l("name", false);
        descriptor = e1Var;
    }

    private ShortcutConfigurationModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        h[] hVarArr = ShortcutConfigurationModel.y;
        q1 q1Var = q1.a;
        return new KSerializer[]{q1Var, n.a, hVarArr[2].getValue(), hVarArr[3].getValue(), hVarArr[4].getValue(), hVarArr[5].getValue(), q1Var};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final ShortcutConfigurationModel m69deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b = decoder.b(serialDescriptor);
        h[] hVarArr = ShortcutConfigurationModel.y;
        int i = 0;
        String str = null;
        List list = null;
        ShortcutColor shortcutColor = null;
        ShortcutIcon shortcutIcon = null;
        com.github.service.models.response.shortcuts.a aVar = null;
        ShortcutType shortcutType = null;
        String str2 = null;
        boolean z = true;
        while (z) {
            int t = b.t(serialDescriptor);
            switch (t) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.r(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    list = (List) b.A(serialDescriptor, 1, n.a, list);
                    i |= 2;
                    break;
                case 2:
                    shortcutColor = (ShortcutColor) b.A(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), shortcutColor);
                    i |= 4;
                    break;
                case 3:
                    shortcutIcon = (ShortcutIcon) b.A(serialDescriptor, 3, (KSerializer) hVarArr[3].getValue(), shortcutIcon);
                    i |= 8;
                    break;
                case 4:
                    aVar = (com.github.service.models.response.shortcuts.a) b.A(serialDescriptor, 4, (KSerializer) hVarArr[4].getValue(), aVar);
                    i |= 16;
                    break;
                case 5:
                    shortcutType = (ShortcutType) b.A(serialDescriptor, 5, (KSerializer) hVarArr[5].getValue(), shortcutType);
                    i |= 32;
                    break;
                case 6:
                    str2 = b.r(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(t);
            }
        }
        b.g(serialDescriptor);
        return new ShortcutConfigurationModel(i, str, list, shortcutColor, shortcutIcon, aVar, shortcutType, str2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, ShortcutConfigurationModel shortcutConfigurationModel) {
        k.g(encoder, "encoder");
        k.g(shortcutConfigurationModel, "value");
        String str = shortcutConfigurationModel.r;
        SerialDescriptor serialDescriptor = descriptor;
        d5 b = encoder.b(serialDescriptor);
        h[] hVarArr = ShortcutConfigurationModel.y;
        if (b.X(serialDescriptor) || !k.b(str, "")) {
            b.J(serialDescriptor, 0, str);
        }
        b.I(serialDescriptor, 1, n.a, shortcutConfigurationModel.s);
        b.I(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), shortcutConfigurationModel.t);
        b.I(serialDescriptor, 3, (KSerializer) hVarArr[3].getValue(), shortcutConfigurationModel.u);
        b.I(serialDescriptor, 4, (KSerializer) hVarArr[4].getValue(), shortcutConfigurationModel.v);
        b.I(serialDescriptor, 5, (KSerializer) hVarArr[5].getValue(), shortcutConfigurationModel.w);
        b.J(serialDescriptor, 6, shortcutConfigurationModel.x);
        b.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
