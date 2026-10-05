package com.github.domain.shortcuts.model;

import g81.d;
import java.lang.annotation.Annotation;
import k71.x;
import kotlinx.serialization.KSerializer;
import wm.b;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ShortcutModel$Companion {
    public static final /* synthetic */ ShortcutModel$Companion a = new ShortcutModel$Companion();

    public final KSerializer serializer() {
        return new d("com.github.domain.shortcuts.model.ShortcutModel", x.a(b.class), new r71.b[]{x.a(ShortcutConfigurationModel.class), x.a(StoredShortcutModel.class)}, new KSerializer[]{ShortcutConfigurationModel$$serializer.INSTANCE, StoredShortcutModel$$serializer.INSTANCE}, new Annotation[0]);
    }
}
