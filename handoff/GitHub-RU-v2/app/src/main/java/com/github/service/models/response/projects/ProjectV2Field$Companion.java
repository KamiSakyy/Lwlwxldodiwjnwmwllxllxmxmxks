package com.github.service.models.response.projects;

import g81.d;
import java.lang.annotation.Annotation;
import k71.xShadow;
import kotlinx.serialization.KSerializer;
import l01.j0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ProjectV2Field$Companion {
    public static final /* synthetic */ ProjectV2Field$Companion a = new ProjectV2Field$Companion();

    public final KSerializer serializer() {
        return new d("com.github.service.models.response.projects.ProjectV2Field", xShadow.a(j0.class), new r71.b[]{xShadow.a(ProjectV2Field$ProjectV2IterationField.class), xShadow.a(ProjectV2Field$ProjectV2SingleSelectField.class), xShadow.a(ProjectV2Field$ProjectV2TextField.class), xShadow.a(ProjectV2Field$ProjectV2UnknownField.class)}, new KSerializer[]{ProjectV2Field$ProjectV2IterationField$$serializer.INSTANCE, ProjectV2Field$ProjectV2SingleSelectField$$serializer.INSTANCE, ProjectV2Field$ProjectV2TextField$$serializer.INSTANCE, ProjectV2Field$ProjectV2UnknownField$$serializer.INSTANCE}, new Annotation[0]);
    }
}
