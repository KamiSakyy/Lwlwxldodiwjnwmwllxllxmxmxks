package gz;

import com.github.service.dotcom.models.response.copilot.AgentAiModelResponse$$serializer;
import com.github.service.dotcom.models.response.copilot.AgentAiModelsResponse;
import com.github.service.dotcom.models.response.copilot.AgentTaskArtifactResponse$$serializer;
import com.github.service.dotcom.models.response.copilot.AgentTaskCollaboratorResponse$$serializer;
import com.github.service.dotcom.models.response.copilot.AgentTaskResponse;
import com.github.service.dotcom.models.response.copilot.AgentTaskResponse$$serializer;
import com.github.service.dotcom.models.response.copilot.AgentTaskSessionResponse;
import com.github.service.dotcom.models.response.copilot.AgentTaskSessionResponse$$serializer;
import com.github.service.dotcom.models.response.copilot.AgentTasksResponse;
import com.github.service.dotcom.models.response.copilot.AiModelCapabilitiesResponse;
import com.github.service.dotcom.models.response.copilot.AiModelPolicyResponse;
import com.github.service.dotcom.models.response.copilot.ChatAgentResponse$$serializer;
import com.github.service.dotcom.models.response.copilot.ChatAgentsResponse;
import com.github.service.dotcom.models.response.copilot.ChatAiModelResponse;
import com.github.service.dotcom.models.response.copilot.ChatAiModelResponse$$serializer;
import com.github.service.dotcom.models.response.copilot.ChatAiModelsResponse;
import com.github.service.dotcom.models.response.copilot.EventResponse;
import com.github.service.dotcom.models.response.copilot.EventResponse$$serializer;
import com.github.service.dotcom.models.response.copilot.EventsResponse;
import com.github.service.dotcom.models.response.copilot.SteerAgentTaskRequest;
import com.github.service.dotcom.models.response.copilot.serialization.ChatClientConfirmationResponse;
import com.github.service.dotcom.models.response.copilot.serialization.ChatMessageAnnotationsResponse;
import com.github.service.dotcom.models.response.copilot.serialization.ChatMessageCodeVulnerabilityResponse$$serializer;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.issueorpullrequest.IssueTypeColor;
import h0.t0;
import java.lang.annotation.Annotation;
import k81.c1Shadow;
import k81.q1;
import k81.r0;
import xn.g3;
import xn.j3;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class a implements j71.a {
    public final /* synthetic */ int r;

    public /* synthetic */ a(int i) {
        this.r = i;
    }

    public final Object a() {
        switch (this.r) {
            case 0:
                AgentAiModelsResponse.Companion companion = AgentAiModelsResponse.Companion;
                return new k81.d(AgentAiModelResponse$$serializer.INSTANCE, 0);
            case 1:
                AgentTaskResponse.Companion companion2 = AgentTaskResponse.Companion;
                return xn.e.Companion.serializer();
            case 2:
                AgentTaskResponse.Companion companion3 = AgentTaskResponse.Companion;
                return new k81.d(AgentTaskCollaboratorResponse$$serializer.INSTANCE, 0);
            case 3:
                AgentTaskResponse.Companion companion4 = AgentTaskResponse.Companion;
                return new k81.d(AgentTaskArtifactResponse$$serializer.INSTANCE, 0);
            case 4:
                AgentTaskResponse.Companion companion5 = AgentTaskResponse.Companion;
                return new k81.d(r0.a, 0);
            case 5:
                AgentTaskResponse.Companion companion6 = AgentTaskResponse.Companion;
                return new k81.d(AgentTaskSessionResponse$$serializer.INSTANCE, 0);
            case 6:
                AgentTaskSessionResponse.Companion companion7 = AgentTaskSessionResponse.Companion;
                return xn.e.Companion.serializer();
            case 7:
                AgentTaskSessionResponse.Companion companion8 = AgentTaskSessionResponse.Companion;
                return new k81.d(q1.a, 0);
            case 8:
                AgentTaskSessionResponse.Companion companion9 = AgentTaskSessionResponse.Companion;
                return g3.Companion.serializer();
            case 9:
                AgentTasksResponse.Companion companion10 = AgentTasksResponse.Companion;
                return new k81.d(AgentTaskResponse$$serializer.INSTANCE, 0);
            case 10:
                AiModelCapabilitiesResponse.Companion companion11 = AiModelCapabilitiesResponse.Companion;
                return b.Companion.serializer();
            case 11:
                return c1Shadow.e("com.github.service.dotcom.models.response.copilot.AiModelCapabilityTypeResponse", b.values(), new String[]{"chat", "unknown"}, new Annotation[][]{null, null});
            case 12:
                AiModelPolicyResponse.Companion companion12 = AiModelPolicyResponse.Companion;
                return c1Shadow.e("com.github.service.dotcom.models.response.copilot.AiModelPolicyStateResponse", c.values(), new String[]{"enabled", "unconfigured", "disabled"}, new Annotation[][]{null, null, null});
            case 13:
                ChatAgentsResponse.Companion companion13 = ChatAgentsResponse.Companion;
                return new k81.d(ChatAgentResponse$$serializer.INSTANCE, 0);
            case 14:
                ChatAiModelResponse.Companion companion14 = ChatAiModelResponse.Companion;
                return e.Companion.serializer();
            case 15:
                ChatAiModelsResponse.Companion companion15 = ChatAiModelsResponse.Companion;
                return new k81.d(ChatAiModelResponse$$serializer.INSTANCE, 0);
            case 16:
                EventResponse.Companion companion16 = EventResponse.Companion;
                return j3.Companion.serializer();
            case 17:
                EventsResponse.Companion companion17 = EventsResponse.Companion;
                return new k81.d(EventResponse$$serializer.INSTANCE, 0);
            case 18:
                return c1Shadow.e("com.github.service.dotcom.models.response.copilot.ModelPickerCategoryResponse", e.values(), new String[]{"lightweight", "versatile", "powerful", "unknown"}, new Annotation[][]{null, null, null, null});
            case 19:
                SteerAgentTaskRequest.Companion companion18 = SteerAgentTaskRequest.Companion;
                return new k81.d(q1.a, 0);
            case 20:
                return Integer.valueOf(o71.d.r.b(2147418112) + 65536);
            case 21:
                float f = t0.a;
                return Boolean.TRUE;
            case 22:
                IssueType.Companion companion19 = IssueType.Companion;
                return c1Shadow.f("com.github.service.models.response.issueorpullrequest.IssueTypeColor", IssueTypeColor.values());
            case 23:
                return null;
            case 24:
                ChatClientConfirmationResponse.Companion companion20 = ChatClientConfirmationResponse.Companion;
                return hz.a.Companion.serializer();
            case 25:
                return c1Shadow.e("com.github.service.dotcom.models.response.copilot.serialization.ChatClientConfirmationStateResponse", hz.a.values(), new String[]{"accepted", "dismissed", "unknown"}, new Annotation[][]{null, null, null});
            case 26:
                ChatMessageAnnotationsResponse.Companion companion21 = ChatMessageAnnotationsResponse.Companion;
                return new k81.d(ChatMessageCodeVulnerabilityResponse$$serializer.INSTANCE, 0);
            case 27:
                return c1Shadow.e("com.github.service.dotcom.models.response.copilot.serialization.ChatMessageFeedbackType", hz.b.values(), new String[]{"NEGATIVE", "POSITIVE", "unknown"}, new Annotation[][]{null, null, null});
            case 28:
                return c1Shadow.e("com.github.service.dotcom.models.response.copilot.serialization.ChatMessageNegativeFeedbackChoiceType", hz.c.values(), new String[]{"offensive_or_discriminatory", "poorly_formatted", "not_true", "unhelpful", "Unknown"}, new Annotation[][]{null, null, null, null, null});
            default:
                return c1Shadow.e("com.github.service.dotcom.models.response.copilot.serialization.ChatMessageReferenceOwnerTypeResponse", hz.d.values(), new String[]{"Organization", "User", "unknown"}, new Annotation[][]{null, null, null});
        }
    }
}
