package com.rikenmaharjan.automaticcounter.Coordinator;

import com.rikenmaharjan.automaticcounter.Coordinator.FlowCoordinator.RootFlowCoordinator;

public class MainFlowCoordinator {

//    val usermanager: Usermanager,
//    val loginFlowCoordinator: LoginFlowCoordinator,
//    val newsFlowCoordinator: NewsFlowCoordinator,
//    val onboardingFlowCoordinator: OnboardingFlowCoordinator
//)

    private RootFlowCoordinator mrootFlowCoordinator;

    public MainFlowCoordinator(RootFlowCoordinator rootFlowCoordinator){


        mrootFlowCoordinator = rootFlowCoordinator;
    }



//    {
//
//        init {
//            usermanager.currentUser.subscribe { user ->
//                    when (user){
//                is NotAuthenticatedUser -> loginFlowCoordinator.start()
//                is AuthenticatedUser -> if (user.onBoardingCompleted)
//                    newsFlowCoordinator.start()
//                else
//                    onboardingFlowCoordinator.start()
//            }
//            }
//        }
//
//        fun onboardingCompleted(){
//            newsFlowCoordinator.start()
//        }




}
