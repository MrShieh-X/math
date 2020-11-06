package com.mrshiehx.math.geometry.figures;

import com.mrshiehx.math.geometry.AxialSymmetricFigure;
import com.mrshiehx.math.geometry.ClosedFigure;
import com.mrshiehx.math.geometry.GeometricFigure;

public class Circle extends GeometricFigure implements ClosedFigure, AxialSymmetricFigure {
    public static double miniPiStatic;
    public double miniPi=3.14;
    double mRadius;
    double mDiameter=mRadius*2;
    double mSquare=Math.pow(mRadius,2)*Math.PI;
    double mCircumference=mDiameter*Math.PI;
    double mSquareMiniPi=Math.pow(mRadius,2)*miniPi;
    double mCircumferenceMiniPi=mDiameter*miniPi;

    public Circle(double radius){
        this.mRadius=radius;
    }

    public void setRadius(double radius){
        this.mRadius=radius;
        this.mDiameter=radius*2;
    }

    public void setDiameter(double diameter){
        this.mRadius=diameter/2;
        this.mDiameter=diameter;
    }

    public void setRadiusByDiameter(double diameter){
        this.mRadius=diameter/2;
        this.mDiameter=diameter;
    }

    public void setDiameterByRadius(double radius){
        this.mRadius=radius;
        this.mDiameter=radius*2;
    }

    public double getRadius(){
        return mRadius;
    }

    public double getDiameter(){
        return mDiameter;
    }

    public double getSquare(){
        return mSquare;
    }

    public double getSquareMiniPi(){
        return mSquareMiniPi;
    }

    public double getCircumference(){
        return mCircumference;
    }

    public double getCircumferenceMiniPi(){
        return mCircumferenceMiniPi;
    }

    public static double getCircumferenceByRadiusMiniPi(double radius){
        return radius*2*miniPiStatic;
    }

    public static double getCircumferenceByRadius(double radius){
        return radius*2*Math.PI;
    }

    public static double getSquareByRadiusMiniPi(double radius){
        return Math.pow(radius,2)*miniPiStatic;
    }

    public static double getSquareByRadius(double radius){
        return Math.pow(radius,2)*Math.PI;
    }

    public static double getCircumferenceByDiameterMiniPi(double diameter){
        return diameter*miniPiStatic;
    }

    public static double getCircumferenceByDiameter(double diameter){
        return diameter*Math.PI;
    }

    public static double getSquareByDiameterMiniPi(double diameter){
        return Math.pow(diameter/2,2)*miniPiStatic;
    }

    public static double getSquareByDiameter(double diameter){
        return Math.pow(diameter/2,2)*Math.PI;
    }

    public static double getRadiusByDiameter(double diameter){
        return diameter/2;
    }

    public static double getDiameterByRadius(double radius){
        return radius*2;
    }

    public static double getDiameterByCircumferenceMiniPi(double circumference){
        return circumference/miniPiStatic;
    }

    public static double getRadiusByCircumferenceMiniPi(double circumference){
        return circumference/miniPiStatic/2;
    }

    public static double getDiameterByCircumference(double circumference){
        return circumference/Math.PI;
    }

    public static double getRadiusByCircumference(double circumference){
        return circumference/Math.PI/2;
    }

    public static double getDiameterBySquareMiniPi(double square){
        return Math.sqrt(square/miniPiStatic)*2;
    }

    public static double getRadiusBySquareMiniPi(double square){
        return Math.sqrt(square/miniPiStatic);
    }

    public static double getDiameterBySquare(double square){
        return Math.sqrt(square/Math.PI)*2;
    }

    public static double getRadiusBySquare(double square){
        return Math.sqrt(square/Math.PI);
    }

    public static double getCircumferenceBySquare(double square){
        return Math.sqrt(square/Math.PI)*2*Math.PI;
    }

    public static double getSquareByCircumference(double circumference){
        return Math.pow(circumference/Math.PI/2,2);
    }

    public static double getCircumferenceBySquareMiniPi(double square){
        return Math.sqrt(square/miniPiStatic)*2*miniPiStatic;
    }

    public static double getSquareByCircumferenceMiniPi(double circumference){
        return Math.pow(circumference/miniPiStatic/2,2);
    }

    public void setR(double radius){
        setRadius(radius);
    }

    public void setD(double diameter){
        setDiameter(diameter);
    }

    public void setRByD(double diameter){
        setRadiusByDiameter(diameter);
    }

    public void setDByR(double radius){
        setDiameterByRadius(radius);
    }

    public double getR(){
        return getRadius();
    }

    public double getD(){
        return getDiameter();
    }

    public double getS(){
        return getSquare();
    }

    public double getSMiniPi(){
        return getSquareMiniPi();
    }

    public double getC(){
        return getCircumference();
    }

    public double getCMiniPi(){
        return getCircumferenceMiniPi();
    }

    public static double getCByRMiniPi(double radius){
        return getCircumferenceByRadiusMiniPi(radius);
    }

    public static double getCByR(double radius){
        return getCircumferenceByRadius(radius);
    }

    public static double getSByRMiniPi(double radius){
        return getSquareByRadiusMiniPi(radius);
    }

    public static double getSByR(double radius){
        return getSquareByRadius(radius);
    }

    public static double getCByDMiniPi(double diameter){
        return getCircumferenceByDiameterMiniPi(diameter);
    }

    public static double getCByD(double diameter){
        return getCircumferenceByDiameter(diameter);
    }

    public static double getSByDMiniPi(double diameter){
        return getSquareByDiameterMiniPi(diameter);
    }

    public static double getSByD(double diameter){
        return getSquareByDiameter(diameter);
    }

    public static double getRByD(double diameter){
        return getRadiusByDiameter(diameter);
    }

    public static double getDByR(double radius){
        return getDiameterByRadius(radius);
    }

    public static double getDByCMiniPi(double circumference){
        return getDiameterByCircumferenceMiniPi(circumference);
    }

    public static double getRByCMiniPi(double circumference){
        return getRadiusByCircumferenceMiniPi(circumference);
    }

    public static double getDByC(double circumference){
        return getDiameterByCircumference(circumference);
    }

    public static double getRByC(double circumference){
        return getRadiusByCircumference(circumference);
    }

    public static double getDBySMiniPi(double square){
        return getDiameterBySquareMiniPi(square);
    }

    public static double getRBySMiniPi(double square){
        return getRadiusBySquareMiniPi(square);
    }

    public static double getDByS(double square){
        return getDiameterBySquare(square);
    }

    public static double getRByS(double square){
        return getRadiusBySquare(square);
    }

    public static double getCByS(double square){
        return getCircumferenceBySquare(square);
    }

    public static double getSByC(double circumference){
        return getSquareByCircumference(circumference);
    }

    public static double getCBySMiniPi(double square){
        return getCircumferenceBySquareMiniPi(square);
    }

    public static double getSByCMiniPi(double circumference){
        return getSquareByCircumferenceMiniPi(circumference);
    }
}
