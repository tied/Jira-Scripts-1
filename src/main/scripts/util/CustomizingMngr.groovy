package util

/**
 * Created by roland on 30.04.16.
 */


class CustomizingMngr  {

    // Be aware, that the spelling must be as defined in the customizin of JIRA status --> Big and Small
    def wfStatusInProgress = "In Progress"
    def wfStatusDone = "Done"
    def wfStatusToDo = "To Do"
    def wfStatusFlaggedForDeletion = "Flagged for deletion"


    def wfTransitionID_StartWork_11_DEV = 11
    def wfTransitionID_CancelWork_21_DEV = 21
    def wfTransitionID_FinalizeWork_31_DEV = 31
    def wfTransitionID_RestartWork_41_DEV = 41


    def wfTransitionID_Story_StartWork_11_PROD = 11
    def wfTransitionID_Story_CancelWork_21_PROD = 21
    def wfTransitionID_Story_FinishWork_31_PROD = 31
    def wfTranstionID_Story_RestartWork_41_PROD = 41
    def wfTranstionID_Story_FlagForDeletion_51_PROD = 51
    def wfTransitionID_Story_RemoveDeletionFlag_61_PROD = 61







    def customFieldNameRelease = ".Release"
    def customFieldNameSprint = ".Sprint"
    def customFieldNameSprintAndReleaseNames = ".Sprints"
    def customFieldNameDeveloper = ".Developer"
    def customFieldNameAlmSubject = ".Alm_Subject"
    def customFieldNameStoryID = ".Story-ID"
    def customFieldNameITApp_Module = ".IT-App_Module"
    def customFieldNameRequirementID = ".Requirement-ID"
    def customfieldNameTestCaseOrigin = ".TestCaseOrigin"
    def customfieldNameAlmSubjectHP = ".ALM_Subject_HP"
    def customfieldNameTestStatus = ".TestStatus"

    def constantDEV = "DEV"
    def constantJIRA = "JIRA"
    def constantHPALM = "HP-ALM"
    def constantPROD ="PROD"
    def consstantWF ="WF"
    def constantEV = "EV"

    def issueTypeNameSubTasks = "Sub-task"
    def issueTypeNameStory = "Story"
    def issueTypeNameRequirement = "Requirement"
    def issueTypeNameTestCase = "Test Case"
    def issueTypeNameBug = "Bug"
    def issueTypeNameBusinessRequest = "Business Request"
    def issueTypeNameOrder = "Order"
    def issueTypeNameOrderItem = "OrderItem"

    def customFieldNameOrderId = ".Order-ID"
    def customFieldNameOrderItemValue = ".OrderItemValue"
    def customFieldNameOrderItemConfirmationValue = ".OrderItemConfirmationValue"
    def customFieldNameOrderRefresh = ".OrderRefresh"
    def customFieldNameOrderValue = ".OrderValue"
    def customFieldNameOrderConfirmationValue = ".OrderConfirmationValue"
    def customFieldNameExchangeFlag = ".ExchangeFlag"
    def customFieldNameOrderEchangeValue = ".OrderExchangeValue"
    def customFieldNameOrderItemExchangeValue = ".OrderItemExchangeValue"

    CustomizingMngr() {
    }

    def getConsstantWF() {
        return consstantWF
    }

    def getConstantEV() {
        return constantEV
    }

    def getWfStatusInProgress() {
        return wfStatusInProgress
    }

    def getWfStatusDone() {
        return wfStatusDone
    }

    def getWfStatusToDo() {
        return wfStatusToDo
    }

    def getWfStatusFlaggedForDeletion() {
        return wfStatusFlaggedForDeletion
    }

    def getWfTransitionID_StartWork_11_DEV() {
        return wfTransitionID_StartWork_11_DEV
    }

    def getWfTransitionID_CancelWork_21_DEV() {
        return wfTransitionID_CancelWork_21_DEV
    }

    def getWfTransitionID_FinalizeWork_31_DEV() {
        return wfTransitionID_FinalizeWork_31_DEV
    }

    def getWfTransitionID_RestartWork_41_DEV() {
        return wfTransitionID_RestartWork_41_DEV
    }

    def getWfTransitionID_Story_StartWork_11_PROD() {
        return wfTransitionID_Story_StartWork_11_PROD
    }

    def getWfTransitionID_Story_CancelWork_21_PROD() {
        return wfTransitionID_Story_CancelWork_21_PROD
    }

    def getWfTransitionID_Story_FinishWork_31_PROD() {
        return wfTransitionID_Story_FinishWork_31_PROD
    }

    def getWfTranstionID_Story_RestartWork_41_PROD() {
        return wfTranstionID_Story_RestartWork_41_PROD
    }

    def getWfTranstionID_Story_FlagForDeletion_51_PROD() {
        return wfTranstionID_Story_FlagForDeletion_51_PROD
    }

    def getWfTransitionID_Story_RemoveDeletionFlag_61_PROD() {
        return wfTransitionID_Story_RemoveDeletionFlag_61_PROD
    }

    def getCustomFieldNameRelease() {
        return customFieldNameRelease
    }

    def getCustomFieldNameSprint() {
        return customFieldNameSprint
    }

    def getCustomFieldNameSprintAndReleaseNames() {
        return customFieldNameSprintAndReleaseNames
    }

    def getCustomFieldNameDeveloper() {
        return customFieldNameDeveloper
    }

    def getCustomFieldNameAlmSubject() {
        return customFieldNameAlmSubject
    }

    def getCustomFieldNameStoryID() {
        return customFieldNameStoryID
    }

    def getCustomFieldNameITApp_Module() {
        return customFieldNameITApp_Module
    }

    def getCustomFieldNameRequirementID() {
        return customFieldNameRequirementID
    }

    def getCustomfieldNameTestCaseOrigin() {
        return customfieldNameTestCaseOrigin
    }

    def getCustomfieldNameAlmSubjectHP() {
        return customfieldNameAlmSubjectHP
    }

    def getCustomfieldNameTestStatus() {
        return customfieldNameTestStatus
    }

    def getConstantDEV() {
        return constantDEV
    }

    def getConstantJIRA() {
        return constantJIRA
    }

    def getConstantHPALM() {
        return constantHPALM
    }

    def getConstantPROD() {
        return constantPROD
    }

    def getIssueTypeNameSubTasks() {
        return issueTypeNameSubTasks
    }

    def getIssueTypeNameStory() {
        return issueTypeNameStory
    }

    def getIssueTypeNameRequirement() {
        return issueTypeNameRequirement
    }

    def getIssueTypeNameTestCase() {
        return issueTypeNameTestCase
    }

    def getIssueTypeNameBug() {
        return issueTypeNameBug
    }

    def getIssueTypeNameBusinessRequest() {
        return issueTypeNameBusinessRequest
    }

    def getIssueTypeNameOrder() {
        return issueTypeNameOrder
    }

    def getIssueTypeNameOrderItem() {
        return issueTypeNameOrderItem
    }

    def getCustomFieldNameOrderId() {
        return customFieldNameOrderId
    }

    def getCustomFieldNameOrderItemValue() {
        return customFieldNameOrderItemValue
    }

    def getCustomFieldNameOrderItemConfirmationValue() {
        return customFieldNameOrderItemConfirmationValue
    }

    def getCustomFieldNameOrderRefresh() {
        return customFieldNameOrderRefresh
    }

    def getCustomFieldNameOrderValue() {
        return customFieldNameOrderValue
    }

    def getCustomFieldNameOrderConfirmationValue() {
        return customFieldNameOrderConfirmationValue
    }

    def getCustomFieldNameExchangeFlag() {
        return customFieldNameExchangeFlag
    }

    def getCustomFieldNameOrderEchangeValue() {
        return customFieldNameOrderEchangeValue
    }

    def getCustomFieldNameOrderItemExchangeValue() {
        return customFieldNameOrderItemExchangeValue
    }
}