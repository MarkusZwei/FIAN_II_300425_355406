package demo01_designpattern;

import java.util.List;

public class DesignPattern {
	/*
	 * Definition:
	 * 
	 * Ein Entwurfsmuster ist eine anpassbare L�sung f�r ein nicht triviales und
	 * immer immer wiederkehrendes Problem in der Entwicklung, dem Design und der
	 * Architektur von Software. Es ist damit ein Element der Wiederverwendung.
	 * 
	 * - Problem: Es muss ein zu l�sendes Problem vorliegen, z.B. die Notwendigkeit
	 * in einer Anwendung von einem Objekt nur eine einzige Instanz zu haben.
	 * 
	 * - Wiederverwendung: Das Problem muss h�ufig genug vorkommen, damit sich das
	 * Wissen um das Entwurfsmuster lohnt.
	 * 
	 * - L�sung: Das Muster muss das Problem nat�rlich l�sen, und zwar auf eine
	 * anerkannte und im Laufe der Zeit erprobte, gut verstandene und elegante Art
	 * und Weise.
	 * 
	 * - nicht trivial: Das zu L�sende Problem muss eine gewisse Komplexit�t
	 * aufweisen, darf also nicht offensichtlich oder mit einfachen Mitteln zu l�sen
	 * sein. So kann ein Anwender eines Musters Nutzen daraus ziehen, dass jemand
	 * anderes das Problem bereits vollst�ndig durchdacht und gel�st hat.
	 * 
	 * - konkret: Sowohl das Problem als auch die L�sung m�ssen konkret sein. 
	 * Es geht also nicht um  abstrakte Grundsatzfragen, sondern um ganz konkrete 
	 * und praktische Aufgabenstellungen in der Entwicklung von Software. 
	 * Auch die L�sung ist nicht lediglich eine amorphe Skizze, sondern ein 
	 * fertiges, einsetzbares Konstrukt, auch wenn es noch der 
	 * �berf�hrung in Quellcode bedarf.
	 * 
	 * - anpassbar: Die meisten Muster sind recht konkret. Aber es gibt fast immer 
	 * auch den einen oder anderen Freiheitsgrad in der Implementierung und damit 
	 * die M�glichkeit, das Muster an die eigenen Bed�rfnisse anzupassen. 
	 * Und auch die verwendete Sprache macht Unterschiede in der
	 * Implementierung notwendig.
	 * 
	 * �bersicht:
	 * 
	 * ----------------------------------Erzeugermuster------------------------------------
	 * 
	 * Fabrikmethode(Factory Method)
	 * Dieses Muster beschreibt eine Methode, die ein Objekt erzeugt und zur�ckgibt
	 * wobei Unterklassen �ber den konkreten Typs des Objektes entscheiden.
	 * 
	 * Einzelst�ck(Singleton)
	 * Ein Singleton stellt sicher, das es von einer Klasse nur ein einziges 
	 * Objekt geben kann, und eignet sich daher f�r zentrale, nur einmal 
	 * vorhandene Ressourcen.
	 * 
	 * Multiton
	 * Dieses Muster erweitert das Singleton-Muster um einen festen Pool von Objekten,
	 * z.B. um f�nf offene Datenbankverbindungen, die von Clients angefordert werden k�nnen
	 * 
	 * Abstrakte Fabrik(Abstract Factory)
	 * Dieses Muster kann Objekte beliebiger Ebenen in Vererbungshirarchien erzeugen,
	 * ohne dass der Anwender diese kennen muss.
	 * 
	 * Erbauer(Builder)
	 * Mit dem Erbauer Muster lassen sich z.B. Objekte aus verschiedenen Teilen 
	 * konstruieren, indem die Erstellung eines komplexeren Objektes von seiner Darstellung
	 * getrennt ist.
	 * 
	 * Prototyp
	 * Mithilfe dieses Musters lassen sich immer neue Instanzen auf Grundlage 
	 * einer prototypischen  Instanz erzeugen, durch Kopieren und Anpassen des Prototyps
	 * 
	 * ---------------------------------Strukturmuster-----------------------------------
	 * 
	 * Adapter
	 * Der Adapter bringt Klassen zusammen, die eingentlich aufgrund von nicht kompatiblen 
	 * Schnittstellen nicht zusammenarbeiten k�nnen, indem er eine Schnittstelle 
	 * in eine andere �bersetzt.
	 * 
	 * Br�cke(Bridge)
	 * Mit der Br�cke lassen sich Implementierung und Schnittstelle voneinander trennen,
	 * sodass beide unabh�ngig voneinander ver�ndert werden k�nnen.
	 * 
	 * Kompositum
	 * Mithilfe dieses Musters lassen sich komplexere Objekte aus einfacheren Objekten 
	 * erzeugen.
	 * 
	 * Dekorierer(Decorator, Wrapper)
	 * Anstatt Unterklassen zu bilden, k�nnen Sie eine Klasse mit dem Decorator Muster
	 * um neue Funktionalit�ten erweitern.
	 * 
	 * Fassade(Fascade)
	 * Eine Fassade ist eine einheitliche und vereinfachte Schnittstelle, die einen
	 * einfachen und konsistenten Zugang zu einer Menge von Schnittstellen eines
	 * Subsystems erm�glicht.
	 * 
	 * Fliegengewicht
	 * Das Fliegengewicht macht die Verwendung vieler Objekte einfacher und performanter,
	 * die zudem variable Informationen teilen.
	 * 
	 * Proxy
	 * Ein Proxy Objekt dient dazu, auf ein anderes, nachgelagertes Objekt zuzugreifen, und
	 * zwar in einer kontrollierten Art und Weise.
	 * 
	 *  -----------------------------Verhaltensmuster-----------------------------------------
	 *  
	 * Zust�ndigkeitskette
	 * Die Zust�ndigkeitskette erlaubt es, das mehrere Objekte miteinander verkettet werden,
	 * damit sie gemeinsam eine eingehende Anforderung verarbeiten. Diese Anforderung wird
	 * solange entlang der Kette weitergereicht, bis eines der Objekte in der Kette die
	 * Anforderung bearbeiten kann.
	 * 
	 * Befehl
	 * Das Befehlsmuster kapselt Befehle in Objekten, die dann parametrisiert oder auch
	 * weiterleitet, verz�gert oder f�r ein sp�teres Undo gespeichert werden k�nnen.
	 *  
	 * Interceptor
	 * Mithilfe einer Umleitung wird die urspr�ngliche Kette der Verarbeitung um ein
	 * neues Glied erweitert, sodass die Funktionalit�t bequem erweitert werden kann.
	 * 
	 * Interpreter
	 * Mithilfe des Interpreters lassen sich Probleme in einer eigenen Sprache beschreiben.
	 * Der Interpreter interpretiert dann die Grammatik dieser Sprache und l�st das Problem.
	 * 
	 * Iterator
	 * Das Iterator Muster ist ebenfalls h�ufig anzutreffen. Er erm�glicht das sequenzielle
	 * Durchlaufen einer Menge von Objekten oder Elemente eines zusammengesetzten Objektes.
	 * 
	 * Vermittler
	 * Ein Vermittler Muster vermittelt zwischen verschiedenen Objekten, indem es das 
	 * Zusammenwirken dieser Objekte in sich kapselt.
	 * 
	 * Memento
	 * Das Memento Muster erstellt eine Momentaufnahme des inneren Zustands eines Objektes,
	 * sodass sp�ter das Objekt wieder in diesen Zustand versetzt werden kann. z.B. um ein
	 * Undo zu erm�glichen.
	 * 
	 * Beobachter(Observer)
	 * Mithilfe des Beobachters lassen sich beliebig viele Beobachter Objekte 
	 * benachrichtigen sobald sich am beobachteten Objekt etwas ver�ndert, 
	 * ohne dass das zu beobachtende Objekt seine Beobachter kennt.
	 * 
	 * Zustand(State)
	 * Dieses Muster erlaubt es, das ein Objekt sein Verhalten �ndert, sobald sich sein
	 * innerer Zustand �ndert. Von aussen sieht es dabei aus, als ob man eine andere Klasse 
	 * verwenden w�rde.
	 * 
	 * Strategie
	 * Eine Strategie ist im Kontext dieses Musters ein bestimmtes Verhalten 
	 * oder ein bestimmter Algorithmus. Das Strategiemuster gestattet es nur, 
	 * dass dieses Verhalten ausgetauscht werden 
	 * kann und zwar in Abh�ngikeit vom Verwender.
	 * 
	 * Schablonenmethode(Template Method)
	 * Eine abstrakte Klasse definiert ein Skelett eines Algorithmus, dessen konkrete Teile
	 * dann Unterklassen delegiert werden.
	 * 
	 * Besucher(Visitor)
	 * Dieses Muster trennt eine Klassenhirarchie von einer zweiten Klassenhirarchie,
	 * die die Operationen enth�lt.
	 * 
	 * ----------------------------GUI Muster--------------------------------------------
	 * 
	 * Model View Controller(MVC)
	 * Hier wird ein Muster beschrieben, das aus einem Modell(den darzustellenden Daten)
	 * einer Pr�sentationsschicht und einem Controller f�r die Interaktion besteht.
	 * Das Muster wird vor allem in Webanwendungen gern und h�ufig eingesetzt, und auch 
	 * einige Technologien, wie ASP.NET MVC , erfordern oder beg�nstigen seine Verwendung.
	 * 
	 * Model View Presenter(MVP)
	 * Auch dieses Muster kennt wieder drei Akteure: das Modell(die Logik), die Ansicht 
	 * der Daten(f�r Ein- und Ausgaben) sowie den Pr�sentator, das verbindene Element
	 * zwischen Modell und Ansicht, der die Abl�ufe steuert und die Funktionalit�t 
	 * implementiert.
	 * 
	 * Model View ViewModel(MVVM)
	 * MVVM ist eine Variante vom MVC. Im Kern geht es dabei um die Trennung der 
	 * Verantwortlichkeiten zwischen den Entwicklern und Designern einer Anwendung.
	 */
	

}
