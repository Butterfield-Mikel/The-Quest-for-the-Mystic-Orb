/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Rich
 */
public class WestlandWoodsView extends View {
    //map[4][0].WestlandWoods();
    public WestlandWoodsView() {
        super("Somehow, the apple does the trick and you get yourself to the Westland Woods.n/"
                + "Great job at that by the way.n/"
                + "There's a lot of trees here, but you are still close enough to see the town.n/"
                + "Seriously, there is not a lot to do here, you should probably keep going into the (D)eep Westland Woods n/"
                + ", or just head back to the (C)rossroads.n/"
                + "So what will it be.");
    }
    
        /**
     * @param input
     * 
     * @return
     */
    @Override
    public boolean doAction(char input) {
        switch(input) {
            case 'D' :
                showDeepWestlandWoods();
                break;
            case 'C' :
                showCrossroads();
                break;
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
    }
    
        private void showDeepWestlandWoods() {
      //  DeepWestlandWoodsView showDeepWestlandWoods = new DeepWestlandWoodsView();
     //   char in = showDeepWestlandWoods.getInput();
    }
        private void showCrossroads() {
    //    CrossroadsView showCrossroads = new CrossroadsView();
    //    char in = showCrossroads.getInput();
        }
}